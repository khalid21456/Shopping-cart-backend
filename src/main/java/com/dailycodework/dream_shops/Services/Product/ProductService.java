package com.dailycodework.dream_shops.Services.Product;


import com.dailycodework.dream_shops.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

}
