package model;
public abstract class vehicleModel {
    private String modelNo;
    private String type;
    private double mileage;
    private double rentalPrice;
    private boolean isAvailable;

    public vehicleModel(String modelNo, String type, double mileage, double rentalPrice) {
        this.modelNo = modelNo;
        this.type = type;
        this.mileage = mileage;
        this.rentalPrice = rentalPrice;
        this.isAvailable = true;
    }

    public String getModelNo() {
        return modelNo;
    }

    public String getType() {
        return type;
    }

    public double getMileage() {
        return mileage;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
    public void markUnAvailable(){
        isAvailable = false;
    }
    public void markAvailable(){
        isAvailable = true;
    }
    public abstract double generateBill();
}
