package com.dailycodework.dream_shops.DTO;


import com.dailycodework.dream_shops.Models.Category;
import com.dailycodework.dream_shops.Models.Image;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductUpdateDTO {
    private String name;
    private String description;
    private int qte;
    private BigDecimal price;
    private Category category;
}
