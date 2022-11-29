package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.Product;

import java.util.Collection;

public interface ProductDAO
{
    Collection<Product> getProducts();

    Product findProduct(String productId);
}
