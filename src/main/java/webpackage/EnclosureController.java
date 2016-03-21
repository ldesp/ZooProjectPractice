
package webpackage;

import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import domainpackage.EnclosureService;
import webpackage.other.Enclosure;

@ManagedBean
public class EnclosureController {

	private List<Enclosure>		enclosures;
	@Inject
	private EnclosureService	enclosureService;

	public String showEnclosuresClicked() {
		enclosures = enclosureService.retrieveAllEnclosuresFromDataBase();
		return "Show";
	}
	
	public List<Enclosure> getEnclosures() {
		return enclosures;
	}

	public EnclosureService getEnclosureService() {
		return enclosureService;
	}

	public void setEnclosures(List<Enclosure> enclosures) {
		this.enclosures = enclosures;
	}

	public void setEnclosureService(EnclosureService enclosureService) {
		this.enclosureService = enclosureService;
	}
}
