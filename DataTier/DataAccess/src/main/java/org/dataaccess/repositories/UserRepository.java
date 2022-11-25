package org.dataaccess.repositories;

import org.dataaccess.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
    @Query("SELECT u FROM User u WHERE u.username =: userName AND u.password =: password")
    Optional<User> findUser(@Param("userName") String userName, @Param("password") String password);

    @Query("SELECT u FROM User u WHERE u.username =: userName")
    Optional<User> findUserByUsername(@Param("userName") String userName);
}
