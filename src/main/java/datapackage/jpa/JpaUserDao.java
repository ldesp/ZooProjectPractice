package datapackage.jpa;

import javax.enterprise.inject.Model;

import datapackage.Users;
import datapackage.dao.UserDao;

@Model
public class JpaUserDao extends JpaDao<String, Users> implements UserDao {

	public JpaUserDao() {
		super(Users.class);
	}
	
	
	
}
