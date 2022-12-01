package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.Cart;
import org.dataaccess.Shared.User;

import java.util.Collection;

public interface CartDAO
{
    void registerCart(Cart cart);

    Collection<Cart> getFromCartByUsername(User username);

    void deleteFromCartByUsername(String username);
}
