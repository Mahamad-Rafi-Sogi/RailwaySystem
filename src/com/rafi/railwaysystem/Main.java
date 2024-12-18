package com.rafi.railwaysystem;

public class Main {
	public static void main(String[] args) {
	
		RailwayReservationSystem system = new RailwayReservationSystem();
		
        system.displayTrains();

        Passenger passenger1 = new Passenger("Alice", 25);
        Passenger passenger2 = new Passenger("Bob", 30);
        Passenger passenger3 = new Passenger("Rafi", 24);

        system.bookTicket(101, passenger1);
        system.bookTicket(102, passenger2);
        system.bookTicket(103, passenger3);

        system.displayTrains();

        system.cancelTicket(1);

        system.displayTrains();
	}
}
