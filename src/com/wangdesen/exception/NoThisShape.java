package com.wangdesen.exception;

/**
 * 自定义无此类型异常
 * @author wangdesen
 * @version 1.0
 * @更新时间：2015年12月10日16:18:33
 * */
@SuppressWarnings("serial")
public class NoThisShape extends Exception {

	public NoThisShape(String aName){
		super(aName);
	}
}
