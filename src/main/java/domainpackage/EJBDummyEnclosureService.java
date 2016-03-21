
package domainpackage;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import webpackage.other.Enclosure;

@Stateless
public class EJBDummyEnclosureService implements EnclosureService {

	@Override
	public List<Enclosure> retrieveAllEnclosuresFromDataBase() {
		List<Enclosure> l = new ArrayList<>();
		Enclosure lion1 = new Enclosure();
		lion1.setName("Lion's Enclosure");
		l.add(lion1);

		Enclosure lion2 = new Enclosure();
		lion2.setName("Second Lion's Enclosure");
		l.add(lion2);

		Enclosure zebra = new Enclosure();
		zebra.setName("Zebra's Enclosure");
		l.add(zebra);

		return l;
	}
}
