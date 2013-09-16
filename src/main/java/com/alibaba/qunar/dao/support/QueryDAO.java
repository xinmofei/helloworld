/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.dao.support;

import java.util.List;
import java.util.Map;

/**
 * 类QueryDAO.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-9 下午5:22:34
 * @param <E>
 */
public interface QueryDAO {

	<E> E executeForObject(String sqlID, Object bindParams, Class<E> clazz);

	Map<String, Object> executeForMap(String sqlID, Object bindParams);

	<E> E[] executeForObjectArray(String sqlID, Object bindParams,
			Class<E> clazz);

	Map<String, Object>[] executeForMapArray(String sqlID, Object bindParams);

	<E> List<E> executeForObjectList(String sqlID, Object bindParams);

	List<Map<String, Object>> executeForMapList(String sqlID, Object bindParams);

	<E> E[] executeForObjectArray(String sqlID, Object bindParams,
			Class<E> clazz, int beginIndex, int maxCount);

	Map<String, Object>[] executeForMapArray(String sqlID, Object bindParams,
			int beginIndex, int maxCount);

	<E> List<E> executeForObjectList(String sqlID, Object bindParams,
			int beginIndex, int maxCount);

	List<Map<String, Object>> executeForMapList(String sqlID,
			Object bindParams, int beginIndex, int maxCount);

	<T> void executeWithRowHandler(String sqlID, Object bindParams,
			DataRowHandler<T> dataRowHandler);
}
