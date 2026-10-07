package service;
import interfaces.*;
import model.*;
import repository.*;

public class ParkingService {
    private ParkingLotRepository plr;
    private TicketRepository tr;

    public ParkingService(ParkingLotRepository plr, TicketRepository tr) {
        this.plr = plr;
        this.tr = tr;
    }

    public Ticket parkVehicle(int lotId, Vehicle vehicle){
        ParkingLot lot = plr.findbyid(lotId);
        if(lot==null){
            System.out.println("No parking lot is found.");
            return null;
        }
        ParkingSpot spot = lot.findAvailableSpot(vehicle);
        if(lot==null){
            System.out.println("No spots are available for this.");
            return null;
        }
        spot.parkVehicle(vehicle);
        String ticketId = "T-" + System.currentTimeMillis();
        Ticket ticket = new Ticket(ticketId,vehicle,spot);

        tr.save(ticket);
        System.out.println("Ticket : "+ticketId);
        return ticket;
    }

    public void exitVehicle(String ticketId,Payment payment){
        Ticket ticket = tr.findById(ticketId);
        if(ticket==null){
            System.out.println("The ticket is empty.");
            return;
        }
        if(ticket.getClosed()){
            System.out.println("The ticket is closed Already");
            return;
        }

        double amount = calculateFee(ticket);
        payment.pay(amount);
        ticket.getSpot().removeVehicle();
        ticket.closeTicket();
        System.out.println("Vehicle exited successfully.");
    }
    private double calculateFee(Ticket ticket){
        return 100;
    }
    
}
