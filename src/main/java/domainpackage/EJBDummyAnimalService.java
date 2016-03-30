
package domainpackage;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import webpackage.other.Animal;

public class EJBDummyAnimalService implements AnimalService {

	@Override
	public List<Animal> retrieveAllAnimalsFromDataBase() {
		List<Animal> l = new ArrayList<>();
		Animal lion1 = new Animal();
		lion1.setName("Clarence");
		l.add(lion1);

		Animal singe1 = new Animal();
		singe1.setName("cheeta");
		l.add(singe1);

		Animal elephant1 = new Animal();
		elephant1.setName("babar");
		l.add(elephant1);
		
		Animal zebre1 = new Animal();
		zebre1.setName("zazar");
		l.add(zebre1);		
		

		return l;
	}
}
