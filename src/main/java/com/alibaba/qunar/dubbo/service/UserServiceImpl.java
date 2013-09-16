/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.dubbo.service;

import com.alibaba.qunar.api.UserService;
import com.alibaba.qunar.model.User;

/**
 * 类UserServiceImpl.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-13 上午11:37:59
 */
public class UserServiceImpl implements UserService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.alibaba.qunar.api.UserService#getUser(java.lang.String,
	 * java.lang.String)
	 */
	public User getUser(String id, String name) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		return user;
	}

}
