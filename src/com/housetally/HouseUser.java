package com.housetally;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.googlecode.objectify.annotation.NotSaved;

@XmlRootElement
public class HouseUser {
	
	@Id private String email;
	private Boolean admin;
	@NotSaved private Boolean superAdmin;
	@NotSaved private Boolean loggedIn;
	@NotSaved private String loginUrl;
	@NotSaved private String logoutUrl;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public Boolean getSuperAdmin() {
		return superAdmin;
	}
	public void setSuperAdmin(Boolean superAdmin) {
		this.superAdmin = superAdmin;
	}
	public Boolean getLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public String getLoginUrl() {
		return loginUrl;
	}
	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}
	public String getLogoutUrl() {
		return logoutUrl;
	}
	public void setLogoutUrl(String logoutUrl) {
		this.logoutUrl = logoutUrl;
	}
}
