package datapackage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Users
 *
 */
@Entity
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
