package model;

public class bookingModel {
    private userModel user;
    private vehicleModel vehicle;
    private double totalAmount;
    private String status;

    public bookingModel(userModel user, vehicleModel vehicle) {
        this.user = user;
        this.vehicle = vehicle;
        this.totalAmount = vehicle.generateBill();
        this.status = "CONFIRMED";
    }

    public userModel getUser() {
        return user;
    }

    public vehicleModel getVehicle() {
        return vehicle;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }
    public void cancel(){
        status = "CANCELLED";
        vehicle.markAvailable();
    }
    
}
