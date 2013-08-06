/**
 * @author ChenLizhong
 */
package com.clz619.patterns.decorate;

/**
 * @author ChenLizhong
 * @date 2013-8-7
 * @version v1.0
 * @description 奶泡
 */
public class Whip extends CondimentDecorator {

	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Whip";
	}

	@Override
	public double cost() {
		return 0.11 + beverage.cost();
	}

}
