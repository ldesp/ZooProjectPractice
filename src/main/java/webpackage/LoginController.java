
package webpackage;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import domainpackage.LoginAuthenticator;
import domainpackage.LoginCreator;

@ManagedBean
public class LoginController {

	private String name;
	private String password;
	@Inject
	private LoginAuthenticator authenticator;
	@Inject
	private LoginCreator creator;

	public String loginClicked() {
		boolean isValidUser = authenticator.login(name, password);
		if (isValidUser) {
			return "success";
		} else {
			return "failed";
		}
	}

	public String createLoginClicked() {
		boolean isCreated = creator.create(name, password);
		if (isCreated) {
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
