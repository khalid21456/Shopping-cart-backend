package com.dailycodework.dream_shops.DTO;

import com.dailycodework.dream_shops.Models.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String brand;
    private String description;
    private int qte;
    private BigDecimal price;
    private Category category;
}
