/**
 * @author ChenLizhong
 */
package com.clz619.patterns.observer;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description TODO
 */
public class Main {
	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		IObserver display1 = new Display1();
		IObserver display2 = new Display2();
		station.registerObserver(display1);
		station.registerObserver(display2);
		station.setMeasurements(17, 20, 33);
		station.setMeasurements(23, 50, 67);
	}
}
