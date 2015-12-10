package com.wangdesen.test;

import com.wangdesen.creator.ParametricShapeFactory;
import com.wangdesen.exception.NoThisShape;

public class TestParametricFactoryMethod {

	public static void main(String[] args) throws NoThisShape {
		// TODO Auto-generated method stub
		
		ParametricShapeFactory.anOperation("Shape one","circle");
		ParametricShapeFactory.anOperation("Shape two","square");
		ParametricShapeFactory.anOperation("Shape three","delta");
	}

}
