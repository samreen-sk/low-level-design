package service;

import model.bookingModel;
import model.userModel;
import model.vehicleModel;
import repository.bookingRepository;
import repository.vehicleRepository;

public class vehicleService {
    private vehicleRepository vehicleRepo;
    private bookingRepository bookingRepo;

    public vehicleService(vehicleRepository vehicleRepo, bookingRepository bookingRepo) {
        this.vehicleRepo = vehicleRepo;
        this.bookingRepo = bookingRepo;
    }

    public void addVehicle(vehicleModel vehicle){
        if(vehicleRepo.check(vehicle.getModelNo())){
            System.out.println("Vehicle Already Added.");
            return;
        }
        vehicleRepo.saveBooking(vehicle);
        System.out.println(vehicle.getType() + "Vehicle Added" );
    }

    public void bookVehicle(userModel user, String modelNo){
        if(!user.isLicensed()){
            System.out.println("The user is not licensed..");
            return;
        }
        if(bookingRepo.check(user)){
            System.out.println("The user is already booked");
            return;
        }
        if(!vehicleRepo.check(modelNo)){
            System.out.println("The vehicle not found.");
            return;
        }
        vehicleModel vehicle = vehicleRepo.find(modelNo);
        if(!vehicle.isAvailable()){
            System.out.println("This vehicle is not available");
            return;
        }
        bookingModel booking = new bookingModel(user,vehicle);
        bookingRepo.save(booking);
        vehicle.markUnAvailable();
        System.out.println("The Vehicle is booked");
        System.out.println("Vehicle : "+vehicle.getModelNo());
        System.out.println("Generated Bill : "+ vehicle.generateBill());
    }

    public void cancelBooking(userModel user, String modelNo){
        if(!bookingRepo.check(user)){
            System.out.println("the user bookings not found");
            return;
        }
        bookingModel book = bookingRepo.find(user);
        book.cancel();
        bookingRepo.delete(user);
        System.out.println("the booking is cancelled.");
    }

    public void showBooking(userModel user){
        if(!bookingRepo.check(user)){
            System.out.println("The booking not found");
            return;
        }
        bookingModel book = bookingRepo.find(user);
        System.out.println("User : "+ book.getUser().getName());
        System.out.println("Vehicle : " + book.getVehicle().getModelNo());
        System.out.println("Type : "+ book.getVehicle().getType());
        System.out.println("Amount : "+book.getTotalAmount());
        System.out.println("Status : "+book.getStatus());
    }
}
