/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.dao.support;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 类QueryDAOMybatisImpl.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-9 下午5:30:02
 */
public class QueryDAOMybatisImpl extends SqlSessionDaoSupport implements
		QueryDAO {

	public <E> E executeForObject(String sqlID, Object bindParams,
			Class<E> clazz) {
		E rObj = null;
		Object obj = this.getSqlSession().selectOne(sqlID, bindParams);
		if (obj != null && clazz != null) {
			rObj = clazz.cast(obj);
		}
		return rObj;
	}

	public Map<String, Object> executeForMap(String sqlID, Object bindParams) {
		Map<String, Object> rObj = this.executeForObject(sqlID, bindParams,
				Map.class);

		return rObj;
	}

	public <E> E[] executeForObjectArray(String sqlID, Object bindParams,
			Class<E> clazz) {
		E[] retArray;
		List<E> list = this.getSqlSession().selectList(sqlID, bindParams);
		retArray = (E[]) Array.newInstance(clazz, list.size());
		list.toArray(retArray);
		return retArray;
	}

	public Map<String, Object>[] executeForMapArray(String sqlID,
			Object bindParams) {
		return this.executeForObjectArray(sqlID, bindParams, Map.class);
	}

	public <E> List<E> executeForObjectList(String sqlID, Object bindParams) {
		return this.getSqlSession().selectList(sqlID, bindParams);
	}

	public List<Map<String, Object>> executeForMapList(String sqlID,
			Object bindParams) {
		return this.executeForObjectList(sqlID, bindParams);
	}

	public <E> E[] executeForObjectArray(String sqlID, Object bindParams,
			Class<E> clazz, int beginIndex, int maxCount) {
		E[] retArray;
		List<E> list = this.getSqlSession().selectList(sqlID, bindParams,
				new RowBounds(beginIndex, maxCount));
		retArray = (E[]) Array.newInstance(clazz, list.size());
		list.toArray(retArray);
		return retArray;
	}

	public Map<String, Object>[] executeForMapArray(String sqlID,
			Object bindParams, int beginIndex, int maxCount) {
		return this.executeForObjectArray(sqlID, bindParams, Map.class,
				beginIndex, maxCount);
	}

	public <E> List<E> executeForObjectList(String sqlID, Object bindParams,
			int beginIndex, int maxCount) {
		return this.getSqlSession().selectList(sqlID, bindParams,
				new RowBounds(beginIndex, maxCount));
	}

	public List<Map<String, Object>> executeForMapList(String sqlID,
			Object bindParams, int beginIndex, int maxCount) {
		return this.executeForObjectList(sqlID, bindParams, beginIndex,
				maxCount);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.alibaba.qunar.dao.support.QueryDAO#executeWithRowHandler(java.lang
	 * .String, java.lang.Object, com.alibaba.qunar.dao.support.DataRowHandler)
	 */
	public <T> void executeWithRowHandler(String sqlID, Object bindParams,
			DataRowHandler<T> dataRowHandler) {
		ResultHandler handler;
		this.getSqlSession().select(sqlID, bindParams,
				new ResultHandlerWrapper(dataRowHandler));

	}

}
