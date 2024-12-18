package com.rafi.railwaysystem;

public class Ticket {
    private static int ticketCounter = 1;

    int ticketId;
    Train train;
    private Passenger passenger;

    private Ticket(Train train, Passenger passenger) {
        this.ticketId = ticketCounter++;
        this.train = train;
        this.passenger = passenger;
    }

    public static Ticket createTicket(Train train, Passenger passenger) {
        return new Ticket(train, passenger);
    }

    
    
    @Override
    public String toString() {
        return "Ticket{" +
                "TicketID=" + ticketId +
                ", Train=" + train.getTrainName() +
                ", Passenger=" + passenger.getName() +
                '}';
    }

}
