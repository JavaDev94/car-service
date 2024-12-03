package com.oneCar.car_service.models.dto;

import java.time.LocalDate;

public class SparePartDto {

    private Long id;
    private ServiceOrderDto serviceOrderDto;
    private String partName;
    private Double partCost;
    private OperatorDto operatorDto;
    private LocalDate createDate;
    private LocalDate updateDate;
}
