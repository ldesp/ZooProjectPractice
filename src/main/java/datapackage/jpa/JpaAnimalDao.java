package datapackage.jpa;

import javax.enterprise.inject.Model;

import datapackage.Animals;
import datapackage.dao.AnimalDao;

@Model
public class JpaAnimalDao extends JpaDao<String, Animals> implements AnimalDao {

	public JpaAnimalDao() {
		super(Animals.class);
	}
	
	
	
}
