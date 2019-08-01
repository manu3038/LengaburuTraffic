package com.manu.lengaburutraffic;

public class orbits {
	private int Traffic;
	private int distance;
	private int noOfCrates;
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int i) {
		this.distance = i;
	}
	public int getNoOfCrates() {
		return noOfCrates;
	}
	public void setNoOfCrates(int noOfCrates) {
		this.noOfCrates = noOfCrates;
	}
	public int getTraffic() {
		return Traffic;
	}
	public void setTraffic(int traffic) {
		Traffic = traffic;
	}
	
	/*function to check the deviation of crates based on the weather*/
	public int getCratesIncrease(int i, int percentage) {
		int percentageValue = percentage/100 * i;
		return i+percentageValue;
	}
	public int getCratesDecrease(int i, int percentage) {
		int percentageValue = percentage/100 * i;
		return i-percentageValue;
	}
}
