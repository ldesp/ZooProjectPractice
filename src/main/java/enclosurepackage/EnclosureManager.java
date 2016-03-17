
package enclosurepackage;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

@ManagedBean
public class EnclosureManager {

	private List<String>		enclosures;
	@Inject
	private EnclosureService	enclosureService;

	@Inject
	public EnclosureManager(EnclosureService enclosureService) {
		this.enclosureService = enclosureService;
	}

	public EnclosureManager() {
		// App Throws an Error When no Explicit Empty Constructor
	}

	public String showEnclosuresClicked() {
		enclosures = enclosureService.retrieveAllEnclosuresFromDataBase();
		return "Show";
	}

	public List<String> getEnclosures() {
		return enclosures;
	}

	public EnclosureService getEnclosureService() {
		return enclosureService;
	}

	public void setEnclosures(List<String> enclosures) {
		this.enclosures = enclosures;
	}

	public void setEnclosureService(EnclosureService enclosureService) {
		this.enclosureService = enclosureService;
	}
}
