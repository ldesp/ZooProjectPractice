
package loginpackage;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginController {

	private String				name;
	private String				password;
	private LoginAuthenticator	authenticator;

	public LoginController(LoginAuthenticator authenticator) {
		this.authenticator = authenticator;
	}

	/**
	 * Empty Contructor need for jsf
	 */
	public LoginController() {
		this.authenticator = new LoginAuthenticator();
	}

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
