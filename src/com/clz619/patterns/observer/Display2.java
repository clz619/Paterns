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
 * @description 布告板2观察者 公布平均温度湿度压强
 */
public class Display2 implements IObserver, IDisplayElement {

	private List<WeatherData> weatherDatas;

	public Display2() {
		weatherDatas = new ArrayList<WeatherData>();
	}

	@Override
	public void display() {
		float t = 0;
		float h = 0;
		float p = 0;
		int size = weatherDatas.size();
		for (int i = 0; i < size; i++) {
			t += weatherDatas.get(i).getTemperature();
			h += weatherDatas.get(i).getHumidity();
			p += weatherDatas.get(i).getPressure();
		}

		t = t / size;
		h = h / size;
		p = p / size;

		System.out.println("布告板2\n平均温度：" + t + "，湿度：" + h + "，压强：" + p);
	}

	@Override
	public void update(IObservable observale, Object arg) {
		if (observale instanceof WeatherStation) {
			if (arg instanceof WeatherData) {
				weatherDatas.add((WeatherData) arg);
			}
		}
		display();
	}

}
