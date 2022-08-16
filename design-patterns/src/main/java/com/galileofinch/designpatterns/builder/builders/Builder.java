package com.galileofinch.designpatterns.builder.builders;

import com.galileofinch.designpatterns.builder.Components.Engine;
import com.galileofinch.designpatterns.builder.Components.GPSNavigator;
import com.galileofinch.designpatterns.builder.Components.Transmission;
import com.galileofinch.designpatterns.builder.Components.TripComputer;
import com.galileofinch.designpatterns.builder.cars.CarType;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
