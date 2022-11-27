package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.User;

public interface UserDAO
{
    User registerUser(User user);

    User loginUser(User user);
}
