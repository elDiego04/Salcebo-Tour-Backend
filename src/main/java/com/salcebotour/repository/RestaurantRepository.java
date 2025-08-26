package com.salcebotour.repository;

import com.salcebotour.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findByCity(String city);
    List<Restaurant> findByNameContainingIgnoreCase(String name);

}
