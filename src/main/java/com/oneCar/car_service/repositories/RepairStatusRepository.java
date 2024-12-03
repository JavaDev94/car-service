package com.oneCar.car_service.repositories;

import com.oneCar.car_service.models.entity.RepairStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairStatusRepository extends JpaRepository<RepairStatus, Long> {
}
