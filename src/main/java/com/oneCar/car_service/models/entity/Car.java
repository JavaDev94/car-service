package com.oneCar.car_service.models.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User  user;

    private String brand;

    private String model;

    private String vin;

    @Column(name = "year_of_manufacture")
    private LocalDate yearOfManufacture;

}
