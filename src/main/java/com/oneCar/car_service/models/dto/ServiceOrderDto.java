package com.oneCar.car_service.models.dto;

import java.time.LocalDate;

public class ServiceOrderDto {

    private Long id;
    private UserDto userDto;
    private CarDto carDto;
    private LocalDate orderDate;
    private RepairStatusDto repairStatusDto;
    private Double totalCost;
    private LocalDate startDate;
    private LocalDate finishDate;
    private OperatorDto operatorDto;
    private DiscountDto discountDto;
}
