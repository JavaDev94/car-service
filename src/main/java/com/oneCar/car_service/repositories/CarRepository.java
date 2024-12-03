package com.oneCar.car_service.repositories;

import com.oneCar.car_service.models.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
