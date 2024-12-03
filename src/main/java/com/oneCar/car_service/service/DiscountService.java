package com.oneCar.car_service.service;

import com.oneCar.car_service.models.dto.DiscountDto;
import com.oneCar.car_service.models.entity.Discount;

import java.util.List;

public interface DiscountService {

    Discount getById(Long id);

    DiscountDto save(DiscountDto discountDto);

    void deleteById(Long id);

    List<DiscountDto> findAll();

    DiscountDto update(DiscountDto discountDto);
}
