package com.galileofinch.designpatterns.builder.components;

import com.galileofinch.designpatterns.builder.cars.Car;

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFueLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()){
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }

}
