package com.galileofinch.designpatterns.builder;

import com.galileofinch.designpatterns.builder.builders.CarBuilder;
import com.galileofinch.designpatterns.builder.builders.CarManualBuilder;
import com.galileofinch.designpatterns.builder.cars.Car;
import com.galileofinch.designpatterns.builder.cars.Manual;
import com.galileofinch.designpatterns.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car build: \n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built: \n" + carManual.print());
    }
}
