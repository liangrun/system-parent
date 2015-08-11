package com.system.domain.entity;


//@Entity
//@Table(name="account")
public class AccountBean {
	/*@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="test_Cheque_seq")
	@SequenceGenerator(name="test_Cheque_seq", sequenceName="test_Cheque_seq")
	@Column(name="accountId")*/
	private Long accountId;
	private LoginBean loginBean;
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public LoginBean getLoginBean() {
		return loginBean;
	}
	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}
	
}
