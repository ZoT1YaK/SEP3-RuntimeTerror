package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.Product;

import java.util.Collection;

public interface ProductDAO
{
    Product registerProduct(Product product);

    Collection<Product> getProducts();

    Product findProduct(String productId);
}
