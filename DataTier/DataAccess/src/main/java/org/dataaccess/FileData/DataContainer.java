package org.dataaccess.FileData;

import org.dataaccess.protobuf.User;

import java.util.ArrayList;
import java.util.Collection;

public class DataContainer
{
    public Collection<User> users = new ArrayList<>();

    public Collection<User> getUsers()
    {
        return users;
    }

    public void setUsers(Collection<User> users)
    {
        this.users = users;
    }
}
