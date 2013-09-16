/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.spring;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类SpringContext.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-12 上午11:53:53
 */
public class SpringContext {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring/provider.xml");
		ctx.start();
		System.out.println("dubbo started");
		System.in.read(); // 按任意键退出

	}
}
