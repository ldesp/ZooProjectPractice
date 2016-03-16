package zooProject;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class Login {
	private String name;
	private String password;

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

	public String validateLogin() {
		if (name.equals(password)) {
			return "success";
		} else {
			return "failed";
		}
	}

}
