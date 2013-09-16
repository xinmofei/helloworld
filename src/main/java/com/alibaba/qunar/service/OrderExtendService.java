/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.qunar.dao.OrderExtendDao;
import com.alibaba.qunar.dao.support.DataRowHandler;
import com.alibaba.qunar.model.OrderExtend;
import com.alibaba.qunar.service.support.AbstractService;

/**
 * 类OrderExtendService.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-9 下午12:05:22
 */
@Repository
public class OrderExtendService extends AbstractService {

	@Resource
	private OrderExtendDao orderExtendDao;

	@Transactional
	public void saveOrderExtend(OrderExtend orderExtend) {
		orderExtendDao.saveOrderExtend(orderExtend);
	}

	public void batchQueryOrderExtendById(int id) {
		this.queryDao.executeWithRowHandler("orderExtend.queryById", id,
				new DataRowHandler<OrderExtend>() {

					public void handleRow(OrderExtend object) {
						System.out.println(object.getContactNumber());
					}

				});
	}

	public OrderExtend queryOrderExtendById(int id) {
		return this.queryDao.executeForObject("orderExtend.queryById", id,
				OrderExtend.class);
	}

	@Transactional
	public void batchSaveOrderExtend(List<OrderExtend> list) {
		this.updateDao.execute("orderExtend.batchSaveOrderExtend", list);
	}
}
