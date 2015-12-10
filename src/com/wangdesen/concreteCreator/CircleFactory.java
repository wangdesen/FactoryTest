package com.wangdesen.concreteCreator;

import com.wangdesen.concreteProduct.Circle;
import com.wangdesen.creator.ShapeFactory;
import com.wangdesen.product.Shape;

/**
 * 定义返回 circle 实例的 CircleFactory
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日14:56:41
 * */
public class CircleFactory extends ShapeFactory {

	@Override
	protected Shape factoryMethod(String aName) {
		// TODO Auto-generated method stub
		return new Circle(aName + " (created by CircleFactory)");
	}

}
