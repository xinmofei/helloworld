/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.dao.support;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

/**
 * 类ResultHandlerWrapper.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-10 下午5:13:46
 */
public class ResultHandlerWrapper<T> implements ResultHandler {

	protected DataRowHandler<T> dataRowHandler = null;

	public ResultHandlerWrapper(DataRowHandler<T> dataRowHandler) {
		this.dataRowHandler = dataRowHandler;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.ibatis.session.ResultHandler#handleResult(org.apache.ibatis
	 * .session.ResultContext)
	 */
	public void handleResult(ResultContext context) {
		this.dataRowHandler.handleRow((T) context.getResultObject());

	}

}
