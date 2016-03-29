package domainpackage;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datapackage.Users;
import datapackage.dao.UserDao;

@Stateless
public class EJBLoginCreator implements LoginCreator {

	@Inject
	private UserDao userDao;

	@Override
	public boolean create(String userName, String password) {
		Users usersInBase = userDao.findById(userName);
		System.out.println(usersInBase);
		if (usersInBase == null) {
			Users newUsers = new Users();
			newUsers.setName(userName);
			newUsers.setPassword(password);
			userDao.persist(newUsers);
			return true;
		} else {
			return false;
		}
	}

}
