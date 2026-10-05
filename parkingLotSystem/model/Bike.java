package model;

import enums.VehicleType;

public class Bike extends Vehicle {

    public Bike(String plateNo) {
        super(plateNo, VehicleType.BIKE);
    }
    
}
