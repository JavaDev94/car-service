package com.oneCar.car_service.repositories;

import com.oneCar.car_service.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
