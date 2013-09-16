/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.alibaba.qunar.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.qunar.model.LoginForm;

/**
 * 类LoginController.java的实现描述：TODO 类实现描述
 * 
 * @author xiongheng.xh 2013-9-6 上午11:32:43
 */
@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, LoginForm command) {
		String username = command.getUsername();
		ModelAndView mv = new ModelAndView("/index/index");
		mv.addObject("command", "LOGIN SUCCESS, " + username);
		return mv;
	}

	@RequestMapping(value = "/json")
	@ResponseBody
	public Object json(HttpServletRequest httpServletRequest) {

		LoginForm loginForm = new LoginForm();

		loginForm.setPassword("123456");
		loginForm.setUsername("xiongheng");
		return loginForm;
	}
}
