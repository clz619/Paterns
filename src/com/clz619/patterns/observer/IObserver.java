/**
 * @author ChenLizhong
 */
package com.clz619.patterns.observer;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description 观察者 标识接口
 */
public interface IObserver {
	public void update(IObservable observale, Object arg);
}
