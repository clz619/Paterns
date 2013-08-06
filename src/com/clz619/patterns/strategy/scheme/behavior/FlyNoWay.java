/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.scheme.behavior;

/**
 * @author ChenLizhong
 * @date 2013-8-6
 * @version v1.0
 * @description 不会飞的行为
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("鸭子不会飞..");
	}

}
