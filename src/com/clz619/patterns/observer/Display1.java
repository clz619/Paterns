/**
 * @author ChenLizhong
 */
package com.clz619.patterns.observer;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description 布告板1是观察者 公布当前温度湿度压强
 */
public class Display1 implements IObserver, IDisplayElement {

	private WeatherData weatherData;

	@Override
	public void update(IObservable observale, Object arg) {
		if (observale instanceof WeatherStation) {
			if (arg instanceof WeatherData) {
				weatherData = (WeatherData) arg;
				display();
			}
		}
	}

	@Override
	public void display() {
		System.out.println("布告板1\n当前 温度：" + weatherData.getTemperature()
				+ "，湿度：" + weatherData.getHumidity() + "，压强："
				+ weatherData.getPressure());
	}

}
