import model.bikeVehicleModel;
import model.carVehicleModel;
import model.truckVehcileModel;
import model.userModel;
import repository.bookingRepository;
import repository.vehicleRepository;
import service.vehicleService;

public class Main {
    public static void main(String[] args) {
        vehicleRepository vehicleRepo = new vehicleRepository();
        bookingRepository bookingRepo = new bookingRepository();
        vehicleService vehicleservice = new vehicleService(vehicleRepo,bookingRepo);

        bikeVehicleModel bike = new bikeVehicleModel("123",45,500,100);
        carVehicleModel car = new carVehicleModel("456",8,3000,800);
        truckVehcileModel truck = new truckVehcileModel("789",5,5000,2000);

        vehicleservice.addVehicle(bike);
        vehicleservice.addVehicle(car);
        vehicleservice.addVehicle(truck);

        userModel user1 = new userModel("sam",true,600078);
        userModel user2 = new userModel("ABC",false,600011);

        vehicleservice.bookVehicle(user1, "456");
        vehicleservice.showBooking(user1);

        vehicleservice.bookVehicle(user1, "123");
        vehicleservice.cancelBooking(user1, "456");
        vehicleservice.bookVehicle(user1, "123");

        vehicleservice.bookVehicle(user2, "123");

    }
}
