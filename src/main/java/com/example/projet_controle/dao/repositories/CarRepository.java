package com.example.projet_controle.dao.repositories;

import com.example.projet_controle.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
    Car findByModele(String model);

    Car findByModelAndPrice(String model, Float price);



    Car deleteCarr(Car car);
}
