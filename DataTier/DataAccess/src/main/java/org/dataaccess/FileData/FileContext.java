package org.dataaccess.FileData;

import org.dataaccess.protobuf.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class FileContext
{
    private final String filePath = "data.json";

    private DataContainer dataContainer;

    public FileContext()
    {
        try
        {
            loadData();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        dataContainer = new DataContainer();
    }

    public Collection<User> users()
    {
        try
        {
            loadData();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return dataContainer.getUsers();
    }

    public void loadData() throws FileNotFoundException
    {
        if (dataContainer != null)
            return;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath)))
        {
            dataContainer = (DataContainer) objectInputStream.readObject();
        } catch (Exception e)
        {
            dataContainer = new DataContainer()
            {{
                setUsers(new ArrayList<>());
            }};
        }
    }

    public void saveChanges()
    {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath)))
        {
            objectOutputStream.writeObject(dataContainer);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
