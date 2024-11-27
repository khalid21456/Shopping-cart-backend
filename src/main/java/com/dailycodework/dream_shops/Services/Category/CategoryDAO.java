package com.dailycodework.dream_shops.Services.Category;

import com.dailycodework.dream_shops.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category,Long> {
    Category findByName(String name);
    Category save(Category category);
}
