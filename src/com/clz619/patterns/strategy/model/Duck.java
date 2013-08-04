/**
 * @author ChenLizhong
 */
package com.clz619.patterns.strategy.model;

/**
 * @author ChenLizhong
 * @date 2013-8-5
 * @version v1.0
 * @description 鸭子类
 * 
 *              1.游戏中会出现各种鸭子，一边游泳戏水一边呱呱叫。
 *              Duck为鸭子抽象类实，现类了鸭子共同的呱呱叫quack()，游泳swim()
 *              MallardDuck,RedheadDuck为Duck的子类 实现Duck的display()来实现自己的在屏幕上显示的外观。
 *              2.此模拟程序需要会飞的鸭子，我们在Duck类添加fly() 来使继承的子类都有fly()
 */
public abstract class Duck {

	public void quack() {
		System.out.println("呱呱...");
	}

	public void swin() {
		System.out.println("游泳...");
	}

	public void fly() {
		System.out.println("飞行...");
	}

	public abstract void display();
}
