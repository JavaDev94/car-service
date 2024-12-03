package com.oneCar.car_service.service;

import com.oneCar.car_service.models.dto.CarDto;

import java.util.List;

public interface CarService {

    CarDto save(CarDto carDto);

    List<CarDto> findAll();

    CarDto findById(Long id);

    void deleteById(Long id);

    CarDto update(CarDto carDto);
}
