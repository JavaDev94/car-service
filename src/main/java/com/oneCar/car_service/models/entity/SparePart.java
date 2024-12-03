package com.oneCar.car_service.models.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "spare_part")
public class SparePart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "service_order_id")
    private ServiceOrder serviceOrder;

    @Column(name = "part_name")
    private String partName;

    @Column(name = "part_cost")
    private double partCost;

    @ManyToOne
    @JoinColumn(name = "operator_id")
    private Operator operator;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "update_date")
    private LocalDate updateDate;

}
