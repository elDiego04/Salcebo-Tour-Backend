package com.salcebotour.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking",
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "tour_id", "tour_date"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "tour_id", nullable = false)
    private Tour tour;

    @CreationTimestamp
    private LocalDateTime bookingDate;

    @NotNull
    private LocalDate tourDate;

    @Positive
    private Integer numPeople;

    @NotNull @PositiveOrZero
    private Double totalPrice;

    @Column(nullable = true)
    private Double discountPercentage;

    @Column(nullable = true)
    private Double discountAmount;

    @Column(nullable = false)
    private double finalPrice;

    @Column(length = 50)
    private String couponCode;
    
    @NotBlank
    @Size(max = 20)
    private String status = "pendiente";

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
