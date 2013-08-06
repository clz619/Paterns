/**
 * @author ChenLizhong
 */
package com.clz619.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description 气象站也是一个可观察者 
 */
public class WeatherStation implements IObservable {
	private boolean change;
	/**
	 * 记录观察者
	 */
	private List<IObserver> observers;

	public WeatherStation() {
		observers = new ArrayList<IObserver>();
	}

	/**
	 * 注册观察者
	 */
	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	/**
	 * 移除观察者
	 */
	@Override
	public void removeObserver(IObserver observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	/**
	 * 移出所有观察者
	 */
	@Override
	public void removeObservers() {
		observers.clear();
	}

	@Override
	/**
	 * 通知观察者
	 */
	public void notifyObservers() {
		notifyObservers(null);
	}

	/**
	 * 通知观察者update
	 */
	@Override
	public void notifyObservers(Object arg) {
		synchronized (this) {
			if (!hasChanged()) {
				return;
			}
			clearChanged();
		}
		for (int i = observers.size() - 1; i >= 0; i--) {
			IObserver observer = observers.get(i);
			observer.update(this, arg);
		}
	}

	/**
	 * 设置状态为更新
	 */
	@Override
	public void setChanged() {
		change = true;
	}

	/**
	 * 清除更新状态
	 */
	@Override
	public void clearChanged() {
		change = false;
	}

	/**
	 * 获得状态
	 */
	@Override
	public boolean hasChanged() {
		return change;
	}

	private float temperature;
	private float humidity;
	private float pressure;

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void measurementsChanged() {
		WeatherData data = new WeatherData();
		data.setHumidity(humidity);
		data.setPressure(pressure);
		data.setTemperature(temperature);
		setChanged();
		notifyObservers(data);
	}
}
