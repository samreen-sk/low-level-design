package repository;
import java.util.*;
import model.*;

public class ParkingLotRepository {
    private Map<Integer,ParkingLot> parkinglots = new HashMap<>();

    public void save(ParkingLot parkingLot){
        parkinglots.put(parkingLot.getLotId(),parkingLot);
    }

    public ParkingLot findbyid(int lotId){
        return parkinglots.get(lotId);
    }
    
}
