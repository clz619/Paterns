/**
 * @author ChenLizhong
 */
package com.clz619.patterns.decorate;

/**
 * @author ChenLizhong
 * @date 2013-8-7
 * @version v1.0
 * @description 浓缩咖啡
 */
public class Espresson extends Beverage {

	public Espresson() {
		description = "Espresson";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
