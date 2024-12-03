package com.oneCar.car_service.service;

import com.oneCar.car_service.models.dto.OperatorDto;

import java.util.List;

public interface OperatorService {

    OperatorDto save(OperatorDto operatorDto);

    OperatorDto findById(Long id);

    List<OperatorDto> findAll();

    void deleteById(Long id);

    OperatorDto update(Long id, OperatorDto operatorDto);

}
