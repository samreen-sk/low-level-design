//Floor is strictly depend on ParkingSpot
//Floor and ParkingSpot has a composition relationship

package model;
import java.util.*;
public class Floor {
    private int floorNo;
    private List<ParkingSpot> spots;

    public Floor(int floorNo) {
        this.floorNo = floorNo;
        spots = new ArrayList<>();
    }

    public int getFloorNo() {
        return floorNo;
    }
    
    public void addSpot(ParkingSpot spot){
        spots.add(spot);
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle){
        for (ParkingSpot sp : spots){
            if(sp.isAvailable() && sp.canFit(vehicle)){
                return sp;
            }
        }
        return null;
    }
}
