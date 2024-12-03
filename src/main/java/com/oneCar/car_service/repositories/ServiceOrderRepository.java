package com.oneCar.car_service.repositories;

import com.oneCar.car_service.models.entity.ServiceOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Long> {
}
