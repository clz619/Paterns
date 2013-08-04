/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.model;

/**
 * @author ChenLizhong
 * @date 2013-8-5
 * @version v1.0
 * @description 鸭子类
 */
public abstract class Duck {

	public void quack() {
		System.out.println("呱呱...");
	}

	public void swin() {
		System.out.println("游泳...");
	}

	public abstract void display();
}
