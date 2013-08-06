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
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("不会叫");
	}

}
