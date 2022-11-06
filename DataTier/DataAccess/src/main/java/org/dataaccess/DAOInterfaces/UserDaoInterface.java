package org.dataaccess.DAOInterfaces;

import org.dataaccess.protobuf.User;

import java.util.Collection;

public interface UserDaoInterface
{
    void CreateUser(User user);

    Collection<User> getUsers();
}
