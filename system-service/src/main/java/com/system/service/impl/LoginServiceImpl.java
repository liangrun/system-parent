package com.system.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.dao.LoginDao;
import com.system.domain.entity.LoginBean;
import com.system.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@Inject
	private LoginDao loginDao;
	
	public void save(LoginBean loginBean) {
		loginDao.save(loginBean);
	}

}
