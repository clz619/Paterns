/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.scheme;

import com.clz619.patterns.strategy.scheme.behavior.FlyNoWay;
import com.clz619.patterns.strategy.scheme.behavior.Squeak;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description 橡皮鸭 不会飞 会吱吱叫
 */
public class RubberDuck extends Duck {
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}

	@Override
	public void display() {
		System.out.println("橡皮鸭");
	}
}
