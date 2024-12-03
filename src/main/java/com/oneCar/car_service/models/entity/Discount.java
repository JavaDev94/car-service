package com.oneCar.car_service.models.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "discount")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;

    @Column(name = "create_date")
    private LocalDate createDate;
}
