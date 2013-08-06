/**
 * @author ChenLizhong
 */
package com.clz619.patterns.decorate;

/**
 * @author ChenLizhong
 * @date 2013-8-7
 * @version v1.0
 * @description 摩卡调料
 */
public class Mocha extends CondimentDecorator {

	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
