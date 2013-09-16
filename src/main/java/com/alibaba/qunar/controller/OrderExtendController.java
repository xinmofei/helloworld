/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.qunar.model.OrderExtend;
import com.alibaba.qunar.service.OrderExtendService;

/**
 * 类OrderExtendController.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-9 下午1:05:49
 */
@Controller
public class OrderExtendController {

	@Autowired
	OrderExtendService orderExtendService;

	@RequestMapping(value = "/saveOrderExtend")
	@ResponseBody
	public Object save(OrderExtend orderExtend) {
		orderExtendService.saveOrderExtend(orderExtend);
		return "success";
	}

	@RequestMapping(value = "/queryOrderExtendById")
	@ResponseBody
	public Object queryById(int id) {
		OrderExtend orderExtend = orderExtendService.queryOrderExtendById(id);
		return orderExtend;
	}

	@RequestMapping(value = "/batchQueryOrderExtendById")
	@ResponseBody
	public Object batchQueryById(int id) {
		orderExtendService.batchQueryOrderExtendById(id);
		return "success";
	}

	@RequestMapping(value = "/batchSaveOrderExtend")
	@ResponseBody
	public Object batchSave() {
		List<OrderExtend> list = new ArrayList<OrderExtend>();
		for (int i = 0; i < 10; i++) {
			OrderExtend orderExtend = new OrderExtend();
			orderExtend.setAddressee("test");
			orderExtend.setContactNumber("123");
			orderExtend.setInvoiceTitle("title");
			orderExtend.setMailingAddress("xin@163");
			orderExtend.setTemplateId("345678");
			orderExtend.setOrderId(new Random().nextLong());
			list.add(orderExtend);
		}
		orderExtendService.batchSaveOrderExtend(list);
		return "success";
	}
}
