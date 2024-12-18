package com.rafi.railwaysystem;

public class Train {
	private int trainNumber;
	private String trainName;
	private int availableSeats;
	
    public Train(int trainNumber, String trainName, int availableSeats) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.availableSeats = availableSeats;
    }
    
    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
    
    public boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }

    public void cancelSeat() {
        availableSeats++;
    }

    @Override
    public String toString() {
        return "Train{" +
                "TrainNumber=" + trainNumber +
                ", TrainName='" + trainName + '\'' +
                ", AvailableSeats=" + availableSeats +
                '}';
    }

}
