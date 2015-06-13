package com.telus.training.ex1;

public class ClockNeedles {

	public double calculateAngle(int hours, int minutes) {
		double hoursAngle = hours*30;
		double minutesAngle = minutes*6;
		
		double angle = Math.abs(hoursAngle - minutesAngle);
		if(angle > 180.0) angle = angle - 180.0;
		return angle;
	}
}
