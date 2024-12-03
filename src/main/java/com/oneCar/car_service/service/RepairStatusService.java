package com.oneCar.car_service.service;

import com.oneCar.car_service.models.dto.RepairStatusDto;

import java.util.List;

public interface RepairStatusService {

    RepairStatusDto save(RepairStatusDto repairStatusDto);

    List<RepairStatusDto> findAll();

    RepairStatusDto findById(Long id);

    void deleteById(Long id);

    RepairStatusDto updateStatus(Long id, RepairStatusDto repairStatusDto);

}
