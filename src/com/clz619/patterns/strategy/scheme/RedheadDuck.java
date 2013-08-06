/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.scheme;

import com.clz619.patterns.strategy.scheme.behavior.FlyWithWings;
import com.clz619.patterns.strategy.scheme.behavior.Quack;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description 红头鸭 会飞会呱呱叫
 */
public class RedheadDuck extends Duck {
	public RedheadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("红头");
	}
}
