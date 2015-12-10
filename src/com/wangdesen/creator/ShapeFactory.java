package com.wangdesen.creator;

import com.wangdesen.product.Shape;

/**
 * 抽象工厂,anOperation调用factoryMethod创建一个对象,并对该对象进行一系列操作
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日14:50:42
 * */
public abstract class ShapeFactory {

	protected abstract Shape factoryMethod(String aName);
	
	//在anOperation中定义Shape的一系列行为
	public void anOperation(String aName){
		Shape s= factoryMethod(aName);
		System.out.println("The current shape is: " + s.name);
	    s.draw();
	    s.erase();
	}
}
