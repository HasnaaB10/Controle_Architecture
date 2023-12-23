package com.example.projet_controle.service;

import com.example.projet_controle.service.dtos.CarDto;

public interface CarManager {
    public CarDto getCarByModele(String model);
    public CarDto saveCar(CarDto carDto);
    public CarDto getCarByModelAndPrice(String model, Float price);
    public CarDto deleteCar(Long id_Car);


}
