/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.dao.support;

import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 类UpdateDAOMybatisImpl.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-10 上午11:47:40
 */
public class UpdateDAOMybatisImpl extends SqlSessionDaoSupport implements
		UpdateDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.alibaba.qunar.dao.support.UpdateDAO#execute(java.lang.String,
	 * java.lang.Object)
	 */
	public int execute(String sqlID, Object bindParams) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update(sqlID, bindParams);

	}

}
