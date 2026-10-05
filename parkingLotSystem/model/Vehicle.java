package model;
import enums.*;

public abstract class Vehicle {
    private String plateNo;
    private VehicleType type;

    public Vehicle(String plateNo, VehicleType type) {
        this.plateNo = plateNo;
        this.type = type;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public VehicleType getType() {
        return type;
    }
    
}
