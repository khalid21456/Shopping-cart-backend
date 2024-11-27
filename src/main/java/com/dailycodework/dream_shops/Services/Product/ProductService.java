package com.dailycodework.dream_shops.Services.Product;


import com.dailycodework.dream_shops.DTO.ProductDTO;
import com.dailycodework.dream_shops.Models.Category;
import com.dailycodework.dream_shops.Models.Product;
import com.dailycodework.dream_shops.Services.Category.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private CategoryDAO categoryDAO;

    public void addProduct(ProductDTO product) {
        Category category = Optional.ofNullable(categoryDAO.findByName(product.getCategory().getName()))
                .orElseGet(() -> {
                    Category newCategory = new Category(product.getCategory().getName());
                    return categoryDAO.save(newCategory);
                });
        product.setCategory(category);
        productDAO.save(createProduct(product,category));
    }

    private Product createProduct(ProductDTO productDTO, Category category) {
        return new Product(
                productDTO.getName(),
                productDTO.getBrand(),
                productDTO.getDescription(),
                productDTO.getQte(),
                productDTO.getPrice(),
                category
        );
    }

    public List<Product> getAllProducts() {
        return productDAO.findAll();
    }

    public void deleteProduct(Long id){
        productDAO.deleteProduct(id);
    }

}
