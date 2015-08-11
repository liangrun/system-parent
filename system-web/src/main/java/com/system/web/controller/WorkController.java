package com.system.web.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.domain.entity.LoginBean;
import com.system.service.LoginService;

@Controller
@RequestMapping("/work")
public class WorkController {
	@Inject
	private LoginService loginService;
	
	@RequestMapping(value="/one-work")
	public String oneWork() {
		LoginBean loginBean = new LoginBean();
		loginBean.setPassWord("password");
		loginBean.setUserName("userName");
		loginService.save(loginBean);
		return "work/one-work";
		
	}
	
	@RequestMapping(value="two-work")
	public String twoWork() {
		return "work/two-work";
	}

	@RequestMapping(value="detail-link")
	public String detailLink() {
		return "work/detail-link";
	}
	
}
