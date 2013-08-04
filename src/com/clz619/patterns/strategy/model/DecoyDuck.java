/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.model;

/**
 * @author ChenLizhong
 * @date 2013-8-5
 * @version v1.0
 * @description 诱饵鸭 不会飞也不会叫
 */
public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("诱饵鸭...");
	}

	@Override
	public void fly() {
	}

	@Override
	public void quack() {
	};
}
