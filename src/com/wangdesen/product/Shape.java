package com.wangdesen.product;

/**
 * shape抽象类
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日14:41:21
 * */
public abstract class Shape {
	
	//勾画shape
	public abstract void draw();
	
	//擦出shape
	public abstract void erase();
	
	public String name;

	public Shape(String aName) {
		// TODO Auto-generated constructor stub
		name = aName;
	}
}
