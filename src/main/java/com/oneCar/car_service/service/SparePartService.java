package com.oneCar.car_service.service;

import com.oneCar.car_service.models.dto.SparePartDto;

import java.util.List;

public interface SparePartService {

    SparePartDto save(SparePartDto sparePartDto);

    SparePartDto findById(Long id);

    List<SparePartDto> findAll();

    void deleteById(Long id);

    SparePartDto update(SparePartDto sparePartDto);

}
