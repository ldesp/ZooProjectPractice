
package webpackage;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import domainpackage.LoginAuthenticator;

@ManagedBean
public class LoginController {

	private String				name;
	private String				password;
	@Inject
	private LoginAuthenticator	authenticator;

	
	public String loginClicked() {
		boolean isValidUser = authenticator.login(name, password);
		if (isValidUser) {
			return "success";
		} else {
			return "failed";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
