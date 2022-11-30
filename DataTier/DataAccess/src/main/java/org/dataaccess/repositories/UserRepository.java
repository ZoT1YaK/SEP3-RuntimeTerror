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
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User findUser(String userName);

    @Query("UPDATE User SET credits = : credits WHERE username = : userName")
    void changeCredits(@Param("credits") int credits, @Param("userName") String userName);
}
