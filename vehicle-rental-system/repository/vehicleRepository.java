package repository;
import java.util.*;
import model.vehicleModel;
import model.userModel;

public class vehicleRepository {
    private Map<String,vehicleModel> vehicles = new HashMap<>();

    public void saveBooking(vehicleModel vehicle){
        vehicles.put(vehicle.getModelNo(),vehicle);
    }

    public vehicleModel find(String modelNo){
        return vehicles.get(modelNo);
    }

    public void delete(String modelNo){
         vehicles.remove(modelNo);
    }

    public boolean check(String modelNo){
        return vehicles.containsKey(modelNo);
    }
}
