
package enclosurepackage;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
@Stateless
public class DummyEnclosureService implements EnclosureService {

	@Override
	public List retrieveAllEnclosuresFromDataBase() {
		List<String> l = new ArrayList<>();
		l.add("Lion's Enclosure");
		l.add("Second Lion's Enclosure");
		l.add("Zebra's Enclosure");
		return l;
	}
}
