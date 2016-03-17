
package loginpackage;

import java.util.HashMap;

/**
 * 
 * @author franzfallavier
 * 
 */
public class DummyLoginAuthenticator implements LoginAuthenticator {

	private static final String PASSWORD_ADMIN = "admin";
	private HashMap<String , String> table;

	/**
	 * Dummy LoginAuthenticator Interface implementation
	 * 
	 * @param userName
	 * @param password
	 * @return true if username & password are admin
	 */
	@Override
	public boolean login(String userName , String password) {
		table = new HashMap<>();
		table.put("franz", PASSWORD_ADMIN);
		table.put("sandrine", PASSWORD_ADMIN);
		table.put("lydie", PASSWORD_ADMIN);
		String ps = table.get(userName);
		if (ps != null && ps.equals(password)) {
			return true;
		}
		return false;
	}
}
