package com.oneCar.car_service.service;

import com.oneCar.car_service.models.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto save(UserDto userDto);

    UserDto findById(Long id);

    List<UserDto> findAll();

    void deleteById(Long id);

    UserDto update(Long id, UserDto userDto);

}
