package com.example.oauth2springboot.controllers;

import com.example.oauth2springboot.models.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    List<Car> mockDb=List.of(new Car(0,"Santro","Gray"),new Car(1,"Ritz","Black"));

    @RequestMapping("/{id}")
    public ResponseEntity<Object> getCarNameById(@PathVariable("id") int carId){
        Car resultCar = mockDb.stream().filter(car -> car.getId() == carId).findFirst().orElse(null);

        if(resultCar!=null){
            return new ResponseEntity<Object>(resultCar, HttpStatus.OK);
        }else{
            return new ResponseEntity<Object>("Car not found",HttpStatus.NOT_FOUND);
        }

    }
}
