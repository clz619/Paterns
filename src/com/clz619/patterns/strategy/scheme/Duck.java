/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.scheme;

import com.clz619.patterns.strategy.scheme.behavior.FlyBehavior;
import com.clz619.patterns.strategy.scheme.behavior.QuackBehavior;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description 鸭子
 */
public class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	public void swim() {
		System.out.println("游泳");
	}

	public void display() {
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}
}
