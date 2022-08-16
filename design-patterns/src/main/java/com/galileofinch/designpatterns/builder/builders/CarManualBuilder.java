package com.galileofinch.designpatterns.builder.builders;

import com.galileofinch.designpatterns.builder.Components.Engine;
import com.galileofinch.designpatterns.builder.Components.GPSNavigator;
import com.galileofinch.designpatterns.builder.Components.Transmission;
import com.galileofinch.designpatterns.builder.Components.TripComputer;
import com.galileofinch.designpatterns.builder.cars.CarType;
import com.galileofinch.designpatterns.builder.cars.Manual;

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
