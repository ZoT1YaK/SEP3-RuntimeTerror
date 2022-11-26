package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDAO
{
    User registerUser(User user);

    User loginUser(User user);
}
