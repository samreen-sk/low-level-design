package model;

public class truckVehcileModel extends vehicleModel {
    private double loadingCharge;

    public truckVehcileModel(String modelNo, double mileage, double rentalPrice,double loadingCharge) {
        super(modelNo, "Truck", mileage, rentalPrice);
        this.loadingCharge = loadingCharge;
    }
    @Override 
    public double generateBill(){
        return getRentalPrice()+loadingCharge;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }
    
}
