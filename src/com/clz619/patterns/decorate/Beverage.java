/**
 * @author ChenLizhong
 */
package com.clz619.patterns.decorate;

/**
 * @author ChenLizhong
 * @date 2013-8-7
 * @version v1.0
 * @description 饮料类
 */
public abstract class Beverage {

	String description = "Unknown Beverage";

	/**
	 * 获得描述
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 价格
	 * 
	 * @return
	 */
	public abstract double cost();
}
