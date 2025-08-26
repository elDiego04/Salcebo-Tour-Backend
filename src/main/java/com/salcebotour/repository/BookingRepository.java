package com.salcebotour.repository;

import com.salcebotour.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByUserId(Long userId);
    List<Booking> findByTourId(Long tourId);
    List<Booking> findByStatus(String status);
    List<Booking> findByTourDate(LocalDate tourDate);
    List<Booking> findByDiscountPercentageGreaterThan(Double discount);

}
