package com.dailycodework.dream_shops.Services.Product;

import com.dailycodework.dream_shops.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("unused")
@Repository
public interface ProductDAO extends JpaRepository<Product,Long> {

    void addProduct(Product product);
    void deleteProduct(Product product);
    List<Product> findAll();
    Product findProductById(Long id);
    void updateProduct(Product product, Long id);
    List<Product> findAllByCategory(String category);
    List<Product> finAllByBrand(String brand);
    List<Product> findAllByName(String name);
    List<Product> findAllByCategoryAndBrand(String category,String brand);
    Long countAll();
}
