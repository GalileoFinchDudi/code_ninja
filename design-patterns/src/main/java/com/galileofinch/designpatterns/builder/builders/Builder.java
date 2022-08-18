package com.galileofinch.designpatterns.builder.builders;

import com.galileofinch.designpatterns.builder.components.Engine;
import com.galileofinch.designpatterns.builder.components.GPSNavigator;
import com.galileofinch.designpatterns.builder.components.Transmission;
import com.galileofinch.designpatterns.builder.components.TripComputer;
import com.galileofinch.designpatterns.builder.cars.CarType;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
