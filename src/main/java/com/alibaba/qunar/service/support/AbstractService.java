/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.service.support;

import javax.annotation.Resource;

import com.alibaba.qunar.dao.support.QueryDAO;
import com.alibaba.qunar.dao.support.UpdateDAO;

/**
 * 类AbstractService.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-9 下午6:41:57
 */
public class AbstractService {

	@Resource
	public QueryDAO queryDao;

	@Resource
	public UpdateDAO updateDao;

	/**
	 * @return the queryDao
	 */
	public QueryDAO getQueryDao() {
		return queryDao;
	}

	/**
	 * @param queryDao
	 *            the queryDao to set
	 */
	public void setQueryDao(QueryDAO queryDao) {
		this.queryDao = queryDao;
	}
}
