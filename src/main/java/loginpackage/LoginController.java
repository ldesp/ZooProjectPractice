
package loginpackage;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

@ManagedBean
public class LoginController {

	private String				name;
	private String				password;
	@Inject
	private LoginAuthenticator	authenticator;

	@Inject
	public LoginController(LoginAuthenticator authenticator) {
		this.authenticator = authenticator;
	}

	public LoginController() {
		// App Throws an Error When no Explicit Empty Constructor
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
