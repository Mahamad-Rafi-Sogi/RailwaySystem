package com.rafi.railwaysystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainManager {
	private static TrainManager instance;
	private static Map<Integer, Train>  trains;
	
	public TrainManager() {
		trains = new HashMap<>();
		initialzeTrains();
	}
	
	public static TrainManager getInstance() {
		if(instance == null)
			instance = new TrainManager();
		return instance;
	}
	
	public void initialzeTrains() {
        trains.put(101, new Train(101, "Express A", 100));
        trains.put(102, new Train(102, "Express B", 200));
        trains.put(103, new Train(103, "Express C", 150));
	}
	
	public Train getTrain(int trainNumber) {
		return trains.get(trainNumber);
	}
	
	public List<Train> getAllTrains(){
		return new ArrayList<>(trains.values());
	}
}
