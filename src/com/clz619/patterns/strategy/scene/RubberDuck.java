/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.scene;

/**
 * @author ChenLizhong
 * @date 2013-8-5
 * @version v1.0
 * @description 橡皮鸭 吱吱叫 不会飞，但是橡皮鸭继承鸭子类的同时也得到了会飞的能力，这是不正确的。我们重写fly()来去除会飞的能力
 */
public class RubberDuck extends Duck {

	@Override
	public void quack() {
		System.out.println("吱吱...");
	}

	@Override
	public void display() {
		System.out.println("橡皮...");
	}

	@Override
	/**
	 * 重写fly让它什么都不做
	 */
	public void fly() {

	}

}
