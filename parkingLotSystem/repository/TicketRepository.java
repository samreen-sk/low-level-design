package repository;
import java.util.*;
import model.*;

public class TicketRepository {
    private Map<String,Ticket> tickets = new HashMap<>();

    public void save(Ticket ticket){
        tickets.put(ticket.getTicketId(),ticket);
    }

    public Ticket findById(String id){
        return tickets.get(id);
    }
}
