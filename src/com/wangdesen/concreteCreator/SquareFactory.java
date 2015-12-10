package com.wangdesen.concreteCreator;

import com.wangdesen.concreteProduct.Square;
import com.wangdesen.creator.ShapeFactory;
import com.wangdesen.product.Shape;

/**
 * 定义返回Square实例的SquareFactory
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日14:58:46
 * */
public class SquareFactory extends ShapeFactory {

	//重载factoryMethod方法，返回Square对象
	@Override
	protected Shape factoryMethod(String aName) {
		// TODO Auto-generated method stub
		return new Square(aName + "(created by SquareFactory)");
	}

}
