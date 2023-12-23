package com.example.projet_controle.service;


import com.example.projet_controle.dao.repositories.CarRepository;

import com.example.projet_controle.service.dtos.CarDto;
import com.example.projet_controle.service.mappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarManagerAction implements CarManager {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarMapper carMapper;

    @Override
    public CarDto getCarByModele(String model) {
        return carMapper.fromCarToCarDto(carRepository.findByModele(model));
    }

    @Override
    public CarDto getCarByModelAndPrice(String model, Float price) {
        return carMapper.fromCarToCarDto(carRepository.findByModelAndPrice(model, price));
    }

    @Override
    public CarDto saveCar(CarDto carDto) {
        return carMapper.fromCarToCarDto(carRepository.save(carMapper.fromCarDtoToCar(carDto)));
    }

    @Override
    public CarDto deleteCar(Long id_Car) {
        return carMapper.fromCarToCarDto(carRepository.deleteById(carMapper.fromCarDtoToCar(carDto)));
    }
}
