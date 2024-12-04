package com.oneCar.car_service.models.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "service_order")
public class ServiceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @OneToOne
    @JoinColumn(name = "repair_status_id")
    private RepairStatus repairStatus;

    @Column(name = "total_cost")
    private Double totalCost;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "finish_date")
    private LocalDate finishDate;

    @ManyToOne
    @JoinColumn(name = "operator_id")
    private Operator operator;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;


}
