package com.oneCar.car_service.models.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "operator")
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phone;

    @Column(name = "create_date")
    private LocalDate createDate;

}
