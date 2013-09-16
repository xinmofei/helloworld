/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.alibaba.qunar.mapper.OrderExtendMapper;
import com.alibaba.qunar.model.OrderExtend;

/**
 * 类OrderExtendDao.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-9 上午11:11:44
 */
@Repository
public class OrderExtendDao {

	@Resource
	OrderExtendMapper orderExtendMapper;

	public void saveOrderExtend(OrderExtend orderExtend) {
		orderExtendMapper.saveOrderExtend(orderExtend);
	}
}
