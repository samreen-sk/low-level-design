package repository;

import java.util.*;

import model.bookingModel;
import model.userModel;
import model.vehicleModel;

public class bookingRepository {
    private Map<userModel,bookingModel> bookings = new HashMap<>();
    
    public void save(bookingModel booking ){
        bookings.put(booking.getUser(),booking);
    }

    public bookingModel find(userModel user){
        return bookings.get(user);
    }

    public void delete(userModel user){
         bookings.remove(user);
    }

    public boolean check(userModel user){
        return bookings.containsKey(user);
    }
}
