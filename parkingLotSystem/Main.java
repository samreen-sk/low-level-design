import enums.*;
import model.*;
import repository.ParkingLotRepository;
import repository.TicketRepository;
import service.*;
import interfaces.*;

public class Main {

    public static void main(String[] args) {

        ParkingLot pl = new ParkingLot(1, "Chennai Parking Lot");

        Floor floor1 = new Floor(1);

        ParkingSpot ps1 = new ParkingSpot(101, SpotType.SMALL);
        floor1.addSpot(ps1);

        ParkingSpot ps2 = new ParkingSpot(102, SpotType.MEDIUM);
        floor1.addSpot(ps2);

        ParkingSpot ps3 = new ParkingSpot(103, SpotType.LARGE);
        floor1.addSpot(ps3);

        pl.addFloors(floor1);

        // Repo
        ParkingLotRepository plr = new ParkingLotRepository();
        TicketRepository tr = new TicketRepository();

        plr.save(pl);

        // Service
        ParkingService ps = new ParkingService(plr, tr);

        Vehicle car = new Car("TN0231");

        Ticket ticket = ps.parkVehicle(1, car);

        if (ticket != null) {

            System.out.println("Ticket ID : " + ticket.getTicketId());

            System.out.println("Spot ID : " + ticket.getSpot().getSpotId());

            Payment payment = new UPIPayment();

            ps.exitVehicle(ticket.getTicketId(),payment);
        }
    }
}