package com.example.projet_controle.service.mappers;

import com.example.projet_controle.dao.entities.Car;
import com.example.projet_controle.service.dtos.CarDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@Component
public class CarMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public CarDto fromCarToCarDto(Car car) {
      return this.modelMapper.map(car, CarDto.class);
    }
    public Car fromCarDtoToCar(CarDto carDto) {
       return this.modelMapper.map(carDto, Car.class);
  }

}
