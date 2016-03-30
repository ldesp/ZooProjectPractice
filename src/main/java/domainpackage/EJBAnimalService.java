
package domainpackage;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datapackage.Animals;
import datapackage.dao.AnimalDao;
import webpackage.other.Animal;

@Stateless
public class EJBAnimalService implements AnimalService {
	@Inject
	private AnimalDao aDao;
	@Override
	public List<Animal> retrieveAllAnimalsFromDataBase() {
		List<Animals> ls = aDao.findAll();	
		List<Animal> l = new ArrayList<>(); 
		for ( Animals items : ls) {
			Animal item =new Animal();
			item.setName(items.getName());
			l.add(item);
		}
		return l;
	}
}
