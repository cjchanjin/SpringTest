package co.cjpark.member.common;

import org.springframework.stereotype.Component;

@Component
public class LoginVO {

	private String loginId;
	private String loginName;
	
	public LoginVO() {
		// TODO Auto-generated constructor stub
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
}
