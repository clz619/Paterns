/**
 * @author ChenLizhong
 */
package com.clz619.patterns.observer;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description 观察者模式
 */
public interface IObservable {

	public void registerObserver(IObserver observer);

	public void removeObserver(IObserver observer);

	public void removeObservers();

	public void notifyObservers();
	
	public void notifyObservers(Object arg);

	public void setChanged();

	public void clearChanged();

	public boolean hasChanged();

}
