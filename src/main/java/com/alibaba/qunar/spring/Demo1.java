/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.spring;

/**
 * 类Demo1.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-12 上午11:54:51
 */
public class Demo1 {

	Demo2 demo2;

	/**
	 * @return the demo2
	 */
	public Demo2 getDemo2() {
		return demo2;
	}

	/**
	 * @param demo2
	 *            the demo2 to set
	 */
	public void setDemo2(Demo2 demo2) {
		this.demo2 = demo2;
	}

	public void show() {
		System.out.println("demo is show");
	}

	public void demo2Show() {
		demo2.show();
	}
}
