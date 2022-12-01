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
    Cart findByUser(User username);

    Cart findById(int cartId);
}
