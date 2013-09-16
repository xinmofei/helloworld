/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.dao.support;

/**
 * 类DataRowHandler.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-10 下午5:09:31
 */
public interface DataRowHandler<T> {
	void handleRow(T object);
}
