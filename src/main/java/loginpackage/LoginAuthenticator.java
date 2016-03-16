
package loginpackage;

/**
 * 
 * @author franzfallavier
 *         This class will only provides the service verify if user is in base and if
 *         its the matching password
 */
public class LoginAuthenticator {

	/**
	 * 
	 * @param userName
	 * @param password
	 * @return true if the user is in base and if the password matches
	 */
	public boolean login(String userName , String password) {
		// TODO Connect DataBase
		// TODO GetList Users and Password
		// TODO Verify if in
		// for the moment the authentification is userName = password
		String userNameInBase = "admin";
		String passwordInBase = "admin";
		return userNameInBase.equals(userName) && passwordInBase.equals(password);
	}
}
