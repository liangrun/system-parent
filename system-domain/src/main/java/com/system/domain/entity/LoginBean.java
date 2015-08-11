package com.system.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="login")
public class LoginBean implements Serializable{
	private static final long serialVersionUID = 4055701192718527399L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="test_login_seq")
	@SequenceGenerator(name="test_login_seq", sequenceName="test_login_seq")
	@Column(name="login_id")
	private Long loginId;
	@Column(name="username")
	private String userName;
	@Column(name="passWord")
	private String passWord;
	
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Long getLoginId() {
		return loginId;
	}
	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
