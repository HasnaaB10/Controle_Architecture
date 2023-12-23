package com.example.projet_controle.service.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CarDto {
    private  String model;
    private String color;
    private Float price;
}
