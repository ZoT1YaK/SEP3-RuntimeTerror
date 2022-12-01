package org.dataaccess.repositories;

import org.dataaccess.Shared.Cart;
import org.dataaccess.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>
{
    Collection<Cart> findAllByUsername(User username);

    @Modifying
    @Query("DELETE FROM Cart c WHERE c.username = ?1")
    void deleteFromCartByUsername(String userName);
}
