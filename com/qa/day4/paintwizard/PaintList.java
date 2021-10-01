package com.qa.day4.paintwizard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaintList {
	List<Paint> paintList = new ArrayList<>();

	public void addPaint(Paint paint) {
		paintList.add(paint);
	}

//	Finds the paint that would result in the least waste
//	given a room area. Stores the waste for each paint in
//	a list, finds the index of the min value, then uses
//	that index to return the corresponding paint brand.
	public Paint leastWaste(int area) {
		List<Double> wasteList = new ArrayList<>();
		for (Paint i : paintList) {
			wasteList.add(i.getWaste(area));
		}
		int minIndex = wasteList.indexOf(Collections.min(wasteList));
		return paintList.get(minIndex);
	}

//	Finds the paint that would be cheapest for a given
//	room area - similar to leastWaste method
	public Paint lowestCost(int area) {
		List<Double> costList = new ArrayList<>();
		for (Paint i : paintList) {
			costList.add(i.getCost(area));
		}
		int minIndex = costList.indexOf(Collections.min(costList));
		return paintList.get(minIndex);
	}

	@Override
	public String toString() {
		return "PaintList = " + paintList + "]";
	}

}
