/**
 * @author ChenLizhong
 */
package com.clz619.patterns.decorate;

/**
 * @author ChenLizhong
 * @date 2013-8-7
 * @version v1.0
 * @description 修饰者模式-动态地将责任附加到对象上。想要扩展功能，装饰者提供有别于继承的另一种选择。
 * 				对扩展开发，对修改关闭。  开放-关闭原则
 * 
 * 				例如：饮料可以加调料我们可以对饮料进行修饰，如浓缩咖啡咖啡加上摩卡
 *              就成了摩卡浓缩咖啡咖啡，再加摩卡就成了双倍摩卡浓缩咖啡咖啡,再加奶泡，就成了双倍摩卡奶泡浓缩咖啡咖啡
 * 
 *              java I/O的类就是用来修饰模式 所以的*InputStream类都是以InputStream类为抽象组件
 */
public class Main {
	public static void main(String[] args) {
		// 获得浓缩咖啡
		Beverage beverage1 = new Espresson();
		System.out
				.println(beverage1.getDescription() + " $" + beverage1.cost());

		// 加入一份摩卡
		beverage1 = new Mocha(beverage1);
		System.out
				.println(beverage1.getDescription() + " $" + beverage1.cost());

		// 加入一份摩卡
		beverage1 = new Mocha(beverage1);
		System.out
				.println(beverage1.getDescription() + " $" + beverage1.cost());

		// 加入奶泡
		beverage1 = new Whip(beverage1);
		System.out
				.println(beverage1.getDescription() + " $" + beverage1.cost());
	}
}
