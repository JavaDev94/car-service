package com.oneCar.car_service.repositories;

import com.oneCar.car_service.models.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
}
