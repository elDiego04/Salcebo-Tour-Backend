package com.salcebotour.repository;

import com.salcebotour.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourRepository extends JpaRepository<Tour, Long> {

    List<Tour> findByCategory(String category);
    List<Tour> findByLocationContainingIgnoreCase(String location);
    List<Tour> findByPriceBetween(Double minPrice, Double maxPrice);

}
