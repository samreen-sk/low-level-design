package model;

public class bikeVehicleModel extends vehicleModel {
    private double helmetCharge;

    public bikeVehicleModel(String modelNo, double mileage, double rentalPrice,double helmetCharge) {
        super(modelNo, "bike", mileage, rentalPrice);
        this.helmetCharge = helmetCharge;
    }

    public double getHelmetCharge() {
        return helmetCharge;
    }
    @Override 
    public double generateBill(){
        return getRentalPrice() + helmetCharge;
    }
}
