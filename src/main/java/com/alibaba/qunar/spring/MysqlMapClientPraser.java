/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.spring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 类PeopleBeanDefinitionParser.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-12 下午5:30:04
 */
public class MysqlMapClientPraser extends AbstractSimpleBeanDefinitionParser {

	/**
	 * element 相当于对应的element元素 parserContext 解析的上下文 builder 用于该标签的实现
	 */
	@Override
	protected void doParse(Element element, ParserContext parserContext,
			BeanDefinitionBuilder builder) {

		String datasourceip = element.getAttribute("datasourceip");
		String username = element.getAttribute("username");
		String id = element.getAttribute("id");
		if (StringUtils.hasText(id)) {
			builder.addPropertyValue("id", id);
		}
		if (StringUtils.hasText(username)) {
			builder.addPropertyValue("username", username);
		}
		if (StringUtils.hasText(datasourceip)) {
			builder.addPropertyValue("datasourceip", datasourceip);
		}
	}

	@Override
	protected Class getBeanClass(Element element) {
		// 返回该标签所定义的类实现,在这里是为了创建出SqlMapClientTemplate对象
		return IbatisClient.class;
	}

}
