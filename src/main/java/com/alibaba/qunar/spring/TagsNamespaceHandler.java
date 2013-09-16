/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 类TagsNamespaceHandler.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-13 上午9:40:12
 */
public class TagsNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		// 自定义标签中的element标签名为client解析注册使用MysqlMapClientPraser进行.
		registerBeanDefinitionParser("client", new MysqlMapClientPraser());
	}
}
