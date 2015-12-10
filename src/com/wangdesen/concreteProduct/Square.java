package com.wangdesen.concreteProduct;

import com.wangdesen.product.Shape;

/**
 * 方形子类
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日14:45:52
 * */
public class Square extends Shape {

	public Square(String aName) {
		super(aName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("It will draw a square.");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("It will erase a square.");
	}

}
