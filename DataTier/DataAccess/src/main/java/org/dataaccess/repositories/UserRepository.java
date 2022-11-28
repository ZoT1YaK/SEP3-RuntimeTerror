package org.dataaccess.repositories;

import org.dataaccess.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String>
{
    /*@Query("SELECT u FROM User u WHERE u.username = ?1 AND u.password = ?2")
    User checkUser(String userName, String password);*/

    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User findUser(String userName);
}
