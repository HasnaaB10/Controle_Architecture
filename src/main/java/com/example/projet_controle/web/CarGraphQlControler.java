package com.example.projet_controle.web;

import com.example.projet_controle.service.CarManager;
import com.example.projet_controle.service.dtos.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller


public class CarGraphQlControler {
    @Autowired
    private CarManager carManager;

    @QueryMapping
    public CarDto getCarByModel(String model) {
        return carManager.getCarByModele(model);
    }
    @QueryMapping
    public CarDto getCarByModelAndPrice(String model, Float price){
        return carManager.getCarByModelAndPrice(model,price);
        }

    @MutationMapping
    public CarDto deleteCar(Long id_Car){
        return deleteCar(id_Car);
        }


    @MutationMapping
    public CarDto saveCar(CarDto carDto) {
        return carManager.saveCar(carDto);
    }

}

