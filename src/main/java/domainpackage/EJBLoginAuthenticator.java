
package domainpackage;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datapackage.Users;
import datapackage.dao.UserDao;

/**
 * 
 * @author franzfallavier
 * 
 */
@Stateless
public class EJBLoginAuthenticator implements LoginAuthenticator {

	private static final String PASSWORD_ADMIN = "admin";

	@Inject
	private UserDao userDao;

	/**
	 * LoginAuthenticator Interface implementation
	 * 
	 * @param userName
	 * @param password
	 * @return true if username & password are admin
	 */
	@Override
	public boolean login(String userName, String password) {
		boolean ret = false;
		Users usersInBase = userDao.findById(userName);
		if ((usersInBase != null) && (usersInBase.getPassword().equals(password))) {
			ret = true;
		}
		return ret;
	}
}
