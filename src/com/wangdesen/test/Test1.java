package com.wangdesen.test;

import com.wangdesen.concreteCreator.CircleFactory;
import com.wangdesen.concreteCreator.SquareFactory;
import com.wangdesen.creator.ShapeFactory;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf1 = new CircleFactory();//圆形工厂
		ShapeFactory sf2 = new SquareFactory();//方形工厂
		
		sf1.anOperation("Shape one");
		sf2.anOperation("Shape two");
	}
	
	public void test1(String args){
		System.out.println("test");
	}
	
	public void test2(String args){
		System.out.println("test");
		if(true){
			System.out.println("");
		}
		System.out.println("sas");
	}

}
