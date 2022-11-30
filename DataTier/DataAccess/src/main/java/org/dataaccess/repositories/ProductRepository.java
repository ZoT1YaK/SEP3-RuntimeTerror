package org.dataaccess.repositories;

import org.dataaccess.Shared.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
    @Modifying(clearAutomatically = true)
    @Query("UPDATE Product SET name = ?2, imgPath = ?3, price = ?4, description = ?5, inStock = ?6 WHERE id = ?1")
    void updateProduct(int id, String name, String imgPath, int price, String description, boolean inStock);
}
