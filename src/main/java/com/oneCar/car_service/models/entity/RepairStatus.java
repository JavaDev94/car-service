package com.oneCar.car_service.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "repair_status")
public class RepairStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status_name")
    private String statusName;

}
