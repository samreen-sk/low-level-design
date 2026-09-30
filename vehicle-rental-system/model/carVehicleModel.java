package model;

public class carVehicleModel extends vehicleModel {
    private double insuranceCost;

    public carVehicleModel(String modelNo, double mileage, double rentalPrice,double insuranceCost) {
        super(modelNo, "car", mileage, rentalPrice);
        this.insuranceCost = insuranceCost;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }
    
    @Override 
    public double generateBill(){
        return getRentalPrice() +insuranceCost;
    }
}
