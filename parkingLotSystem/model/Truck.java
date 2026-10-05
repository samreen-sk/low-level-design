package model;

import enums.VehicleType;

public class Truck extends Vehicle {

    public Truck(String plateNo) {
        super(plateNo, VehicleType.TRUCK);
    }
    
}
