package org.dataaccess.DAOImpl;

import org.dataaccess.DAOInterfaces.CartDAO;
import org.dataaccess.Shared.Cart;
import org.dataaccess.Shared.User;
import org.dataaccess.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class CartDAOImpl implements CartDAO
{
    @Autowired
    private CartRepository cartRepository;

    public CartDAOImpl() {
    }

    @Override
    public void registerCart(Cart cart) {
        cartRepository.saveAndFlush(cart);
    }

    @Override
    public Collection<Cart> getFromCartByUsername(User username) {
        return cartRepository.findAllByUsername(username);
    }

    @Override
    public void deleteFromCartByUsername(String username) {
        cartRepository.deleteFromCartByUsername(username);
    }
}
