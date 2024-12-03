package com.oneCar.car_service.repositories;

import com.oneCar.car_service.models.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operator, Long> {
}
