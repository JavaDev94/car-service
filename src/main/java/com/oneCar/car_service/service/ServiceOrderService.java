package com.oneCar.car_service.service;

import com.oneCar.car_service.models.dto.RepairStatusDto;
import com.oneCar.car_service.models.dto.ServiceDto;
import com.oneCar.car_service.models.dto.ServiceOrderDto;
import com.oneCar.car_service.models.dto.SparePartDto;

public interface ServiceOrderService {

    // Метод для создания нового заказа
     ServiceOrderDto createServiceOrder(ServiceOrderDto  serviceOrderDto);

    // Метод для добавления услуги в заказ
     void addServiceToOrder(ServiceOrderDto orderDto, ServiceDto serviceDto);

    // Метод для добавления запчасти в заказ
     void addSparePartToOrder(ServiceOrderDto orderDto, SparePartDto sparePartDto);

    // Метод для получения текущего статуса заказа
     String getRepairStatus(ServiceOrderDto orderDto);

     ServiceOrderDto getServiceOrderById(Long id);

     ServiceOrderDto updateServiceOrderById(Long id, ServiceOrderDto orderDto);

     ServiceOrderDto getServiceOrderByUserId(Long userId);

     ServiceOrderDto getServiceOrderByCarId(Long carId);

     ServiceOrderDto updateRepairStatus(Long serviceOrderId, RepairStatusDto repairStatusDto);

}
