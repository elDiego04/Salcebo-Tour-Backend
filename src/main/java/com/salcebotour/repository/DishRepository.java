package com.salcebotour.repository;

import com.salcebotour.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DishRepository extends JpaRepository<Dish, Long> {

    List<Dish> findByType(String type);
    List<Dish> findByNameContainingIgnoreCase(String name);

}
