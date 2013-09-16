/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.dao.support;


/**
 * 类UpdateDAO.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-10 上午11:38:00
 */
public interface UpdateDAO {

	int execute(String sqlID, Object bindParams);

}
