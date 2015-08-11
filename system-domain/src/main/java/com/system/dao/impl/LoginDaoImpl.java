package com.system.dao.impl;

import org.springframework.stereotype.Repository;

import com.system.dao.LoginDao;
import com.system.domain.entity.LoginBean;

@Repository
public class LoginDaoImpl extends AbstractGenericDao<LoginBean, Long> implements LoginDao{

}
