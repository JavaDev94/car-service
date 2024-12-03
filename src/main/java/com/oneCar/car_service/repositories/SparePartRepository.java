package com.oneCar.car_service.repositories;

import com.oneCar.car_service.models.entity.SparePart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SparePartRepository extends JpaRepository<SparePart, Long> {
}
