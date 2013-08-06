/**
 * @author ChenLizhong
 */
package com.clz619.patterns.decorate;

/**
 * @author ChenLizhong
 * @date 2013-8-7
 * @version v1.0
 * @description 调料抽象类 继承饮料类，以便让调料可以循环的修饰饮料
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
