package org.dataaccess.DAOImpl;

import org.dataaccess.DAOInterfaces.ProductDAO;
import org.dataaccess.Shared.Product;
import org.dataaccess.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ProductDAOImpl implements ProductDAO
{
    @Autowired
    private ProductRepository productRepository;

    public ProductDAOImpl() {
    }

    @Override
    public Product registerProduct(Product product) {
        productRepository.save(product);

        return product;
    }

    @Override
    public Collection<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findProduct(String productId) {
        return productRepository.findById(Integer.valueOf(productId)).orElse(null);
    }
}
