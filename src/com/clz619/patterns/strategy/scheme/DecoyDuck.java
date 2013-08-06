/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.scheme;

import com.clz619.patterns.strategy.scheme.behavior.FlyNoWay;
import com.clz619.patterns.strategy.scheme.behavior.MuteQuack;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description 诱饵鸭 不会飞也不会叫
 */
public class DecoyDuck extends Duck {

	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("诱饵鸭...");
	}
}
