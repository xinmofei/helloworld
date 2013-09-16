/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.spring;

/**
 * 类People.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-12 下午5:08:41
 */
public class IbatisClient {

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the datasourceip
	 */
	public String getDatasourceip() {
		return datasourceip;
	}

	/**
	 * @param datasourceip
	 *            the datasourceip to set
	 */
	public void setDatasourceip(String datasourceip) {
		this.datasourceip = datasourceip;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	String id;

	String datasourceip;

	String username;

}
