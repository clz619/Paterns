/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.scheme.behavior;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description TODO
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("鸭子飞行...");
	}

}
