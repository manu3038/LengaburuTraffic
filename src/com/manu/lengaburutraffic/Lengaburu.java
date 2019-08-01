package com.manu.lengaburutraffic;

import java.util.Scanner;
import java.util.TreeMap;

public class Lengaburu {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Read Weather from user ex : Sunny
		System.out.println("Weather is (ENTER weather)");
		String weather = sc.next();
		
		//create the orbits with preset of distance and crates
		orbits orbit1= new orbits();
		orbit1.setDistance(18);
		orbit1.setNoOfCrates(20);
		
		orbits orbit2=new orbits();
		orbit2.setDistance(20);
		orbit2.setNoOfCrates(10);
		
		orbits orbit3=new orbits();
		orbit3.setDistance(30);
		orbit3.setNoOfCrates(15);
		
		orbits orbit4=new orbits();
		orbit4.setDistance(15);
		orbit4.setNoOfCrates(18);
		
		//Read the orbits traffic from user
		System.out.println("Enter the orbit1's traffic Speed");
		orbit1.setTraffic(sc.nextInt());
		
		System.out.println("Enter the orbit2's traffic Speed");
		orbit2.setTraffic(sc.nextInt());
		
		System.out.println("Enter the orbit3's traffic Speed");
		orbit3.setTraffic(sc.nextInt());
		
		System.out.println("Enter the orbit4's traffic Speed");
		orbit4.setTraffic(sc.nextInt());
		
		//choose the orbit with higher traffic speed
		if(orbit1.getTraffic() >= orbit2.getTraffic() && orbit1.getTraffic() >= orbit3.getTraffic()) {
			
			//orbit 1 chosen. Hence orbit 4 is chosen to reach RK Puram
			System.out.println("choose Orbit1 to Hallitharam and choose Orbit4 for R K Puram");
			leastTraffic(orbit1, orbit4, weather);
			
		}else if(orbit1.getTraffic() <= orbit2.getTraffic() && orbit2.getTraffic() >= orbit3.getTraffic()){
			
			//orbit 2 chosen. Hence orbit 4 is chosen to reach RK Puram
			System.out.println("choose Orbit2 to Hallitharam and choose Orbit4 for R K Puram");
			leastTraffic(orbit2, orbit4, weather);
			
		}else if(orbit3.getTraffic() >= orbit2.getTraffic() && orbit3.getTraffic() >= orbit1.getTraffic()) {
			
			//orbit 3 chosen. Hence orbit 4 is chosen to reach Hallitharam
			System.out.println("choose Orbit3 to R K Puram and choose Orbit4 to Hallitharam");
			leastTraffic(orbit3, orbit4, weather);
			
		}
		
	}
	
//	function to choose the orbit with min orbit speed between two orbits and get the vehicle for that orbit
	private static void leastTraffic(orbits orbit , orbits orbit4,String weather) {
		
		Vehicles vehicle = new Vehicles();
		if (orbit.getTraffic() <= orbit4.getTraffic()) {
			vehicle.getVehicle(weather, orbit);
		}else {
			vehicle.getVehicle(weather, orbit4);
		}
	}
}
