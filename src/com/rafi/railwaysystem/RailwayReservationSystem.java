package com.rafi.railwaysystem;

import java.util.ArrayList;
import java.util.List;

public class RailwayReservationSystem {

    private TrainManager trainManager;
    private List<Ticket> tickets;

    public RailwayReservationSystem() {
        trainManager = TrainManager.getInstance();
        tickets = new ArrayList<>();
    }

    public void displayTrains() {
        System.out.println("Available Trains:");
        for (Train train : trainManager.getAllTrains()) {
            System.out.println(train);
        }
    }

    public void bookTicket(int trainNumber, Passenger passenger) {
        Train train = trainManager.getTrain(trainNumber);
        if (train != null && train.bookSeat()) {
            Ticket ticket = Ticket.createTicket(train, passenger);
            tickets.add(ticket);
            System.out.println("Ticket booked successfully:\n" + ticket);
        } else {
            System.out.println("Booking failed. Train is full or not found.");
        }
    }

    public void cancelTicket(int ticketId) {
        Ticket ticketToCancel = null;
        for (Ticket ticket : tickets) {
            if (ticketId == ticket.ticketId) {
                ticketToCancel = ticket;
                break;
            }
        }

        if (ticketToCancel != null) {
            ticketToCancel.train.cancelSeat();
            tickets.remove(ticketToCancel);
            System.out.println("Ticket cancelled successfully: " + ticketToCancel);
        } else {
            System.out.println("Ticket not found.");
        }
    }
}
