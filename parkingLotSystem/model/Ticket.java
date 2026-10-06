package model;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot spot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private boolean closed;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
        this.closed = false;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void closeTicket(){
        if(closed){
            System.out.println("Already The ticket is closed.");
            return;
        }
        exitTime = LocalDateTime.now();
        closed = true;
    }
    
}
