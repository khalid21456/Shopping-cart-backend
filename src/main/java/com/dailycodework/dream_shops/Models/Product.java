package com.dailycodework.dream_shops.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@SuppressWarnings("unused")
public class Product {

    public Product(String name, String brand, String description, int qte, BigDecimal price, Category category) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.qte = qte;
        this.price = price;
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String description;
    private int qte;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;
}
