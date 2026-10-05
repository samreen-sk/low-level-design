package model;

import enums.VehicleType;

public class Car extends Vehicle {

    public Car(String plateNo) {
        super(plateNo, VehicleType.CAR);
    }
    
}
