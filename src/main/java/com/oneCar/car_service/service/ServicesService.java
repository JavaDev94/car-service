package com.oneCar.car_service.service;

import com.oneCar.car_service.models.dto.ServiceDto;

import java.util.List;

public interface ServicesService {

    ServiceDto save(ServiceDto serviceDto);

    List<ServiceDto> findAll();

    ServiceDto findById(Long id);

    void deleteById(Long id);

    ServiceDto update(Long id, ServiceDto serviceDto);

}
