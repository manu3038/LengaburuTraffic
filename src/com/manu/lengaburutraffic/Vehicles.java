package com.manu.lengaburutraffic;

import java.util.TreeMap;

public class Vehicles {
	private int speed;
	private int time;
	private String name;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}
	
	/*function to find out which vehicle to use based on weather using the already chosen orbit*/
	public void getVehicle(String weather, orbits orbit) {
		
		//instance of bike
		Vehicles bike = new Vehicles();
		bike.setSpeed(10);
		bike.setTime(2);
		bike.setName("bike");
		
		//instance of tuktuk
		Vehicles tuktuk = new Vehicles();
		tuktuk.setSpeed(12);
		tuktuk.setTime(1);
		tuktuk.setName("tuktuk");
		
		//instance of car
		Vehicles car = new Vehicles();
		car.setSpeed(20);
		car.setTime(3);
		car.setName("Car");
				
		switch (weather) {
		case "Sunny":
			getVehicleByOrbit(orbit,tuktuk,car);
			break;
			
		case "Rainy":
			getVehicleByOrbit(orbit,tuktuk,car);
			break;
			
		case "Windy":
			getVehicleByOrbit(orbit,bike,car);
			break;
			
		}
	}

	public void getVehicleByOrbit(orbits orbit, Vehicles vehicle1, Vehicles vehicle2) {
		TreeMap<String, Integer> crateTimeMap = new TreeMap<String, Integer>();

		if(orbit.getTraffic() > vehicle1.getSpeed()) {
			int crateTime = orbit.getCratesDecrease(orbit.getNoOfCrates(),10)*vehicle2.getTime();
			crateTimeMap.put(vehicle2.getName(), crateTime);
		}else if(orbit.getTraffic() <= vehicle1.getSpeed()) {
			int crateTime = orbit.getCratesDecrease(orbit.getNoOfCrates(),10)*vehicle1.getTime();
			crateTimeMap.put(vehicle1.getName(), crateTime);
		}
		System.out.println("vehicle " + crateTimeMap.firstKey());
		
	}
	
}
