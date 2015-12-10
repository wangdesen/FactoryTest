package com.wangdesen.concreteProduct;

import com.wangdesen.product.Shape;

/**
 * 圆形子类
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日14:44:01
 * */
public class Circle extends Shape {

	public Circle(String aName) {
		super(aName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("It will draw a circle.");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("It will erase a circle.");
	}

}
