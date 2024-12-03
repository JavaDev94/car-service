package com.oneCar.car_service.repositories;

import com.oneCar.car_service.models.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
