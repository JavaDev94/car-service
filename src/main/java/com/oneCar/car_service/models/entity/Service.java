package com.oneCar.car_service.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "service_order_id")
    private ServiceOrder serviceOrder;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "service_cost")
    private Double serviceCost;

}
