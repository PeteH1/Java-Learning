package com.qa.day4.paintwizard;

public class Paint {
	
	String name;
//	These variables all need to be doubles otherwise the maths breaks
	double litreSize;
	double price;
	double coverage;
	
	public Paint(String name, double litreSize, double price, double coverage) {
		this.name = name;
		this.litreSize = litreSize;
		this.price = price;
		this.coverage = coverage;
	}
	
//	Returns the number of tins needed for a
//	specific paint given a room area
	public int getNumOfTins(int area) {
		int numOfTins = (int) (Math.ceil(area / (this.litreSize * this.coverage)));
		return numOfTins;
	}
	
//	Returns the cost of using a specific
//	paint for a given room area
	public double getCost(int area) {
		double cost = this.getNumOfTins(area) * this.price;
		return cost;
	}
	
//	Returns the waste in litres of a specific
//	paint given a room area
	public double getWaste(int area) {
		double waste = (this.getNumOfTins(area) * this.litreSize) - (area / this.coverage);
		return waste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLitreSize() {
		return litreSize;
	}

	public void setLitreSize(int litreSize) {
		this.litreSize = litreSize;
	}

	public double getCost() {
		return price;
	}

	public void setCost(double price) {
		this.price = price;
	}

	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	@Override
	public String toString() {
		return "Paint [litreSize=" + litreSize + ", price=" + price + ", coverage=" + coverage + "]";
	}			
	
	

}
