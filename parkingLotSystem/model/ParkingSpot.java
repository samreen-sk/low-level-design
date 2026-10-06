package model;

import enums.SpotType;
import enums.VehicleType;

public class ParkingSpot {
    private int spotId;
    private Vehicle vehicle;
    private SpotType type;

    public ParkingSpot(int spotId, SpotType type) {
        this.spotId = spotId;
        this.type = type;
    }

    public int getSpotId() {
        return spotId;
    }

    public SpotType getType() {
        return type;
    }

   public void parkVehicle(Vehicle vehicle){
    if(!isAvailable()){
        System.out.println("Sorry spots already Occupied.");
        return;
    }
    if(!canFit(vehicle)){
        System.out.println("Sorry this spot is not Available");
        return;
    }
    this.vehicle = vehicle;
    System.out.println(vehicle.getPlateNo() + "vehicle got parking spot"+spotId);

   }

   public boolean isAvailable(){
    return vehicle==null;
   }

   public boolean canFit(Vehicle vehicle){
    return check(vehicle.getType()) == this.type; 
   }

   private SpotType check(VehicleType type) {

    if (type == VehicleType.BIKE) {
        return SpotType.SMALL;
    } 
    else if (type == VehicleType.CAR) {
        return SpotType.MEDIUM;
    } 
    else {
        return SpotType.LARGE;
    }
}

   public void removeVehicle(){
    if(vehicle==null){
        System.out.println("no vehicle is found");
        return;
    }
    vehicle=null;
    System.out.println("The vehicle is removed from the spot "+ spotId);

   } 
}
