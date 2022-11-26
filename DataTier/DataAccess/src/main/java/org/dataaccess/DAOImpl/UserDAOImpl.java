package org.dataaccess.DAOImpl;

import org.dataaccess.DAOInterfaces.UserDAO;
import org.dataaccess.Shared.User;
import org.dataaccess.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserDAOImpl implements UserDAO
{
    private UserRepository userRepository;

    @Autowired
    public UserDAOImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {

        Optional<User> checkUser = userRepository.findUserByUsername(user.getUsername());
        if (!checkUser.isPresent()) {
            user.setCredits(0);
            user.setType("customer");

            userRepository.save(user);

            return user;
        }

        return null;
    }

    @Override
    public User loginUser(User user)
    {
        Optional<User> checkUser = userRepository.findUser(user.getUsername(), user.getPassword());
        if (checkUser.isPresent())
            return userRepository.getReferenceById(user.getUsername());

        return null;
    }
}
