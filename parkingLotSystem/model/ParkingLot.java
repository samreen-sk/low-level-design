//ParkingLot has a composition relationship with Floor
//ParkingLot is dependent on Floor.

package model;

import java.util.*;
public class ParkingLot {
    private int lotId;
    private String name;
    private List<Floor> floors;

    public ParkingLot(int lotId, String name) {
        this.lotId = lotId;
        this.name = name;
        this.floors = new ArrayList<>();
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public int getLotId() {
        return lotId;
    }

    public String getName() {
        return name;
    }
    
    public void addFloors(Floor floor){
        floors.add(floor);
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle){
        for(Floor f : floors){
            ParkingSpot sp = f.findAvailableSpot(vehicle);

            if(sp!=null){
                return sp;
            }
        }
        return null;
    }
    
}
