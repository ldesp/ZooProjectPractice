
package webpackage;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import domainpackage.EnclosureService;
import webpackage.other.Enclosure;

@ManagedBean
public class EnclosureController {

	private List<Enclosure> enclosures;
	@Inject
	private EnclosureService enclosureService;
	
	private String console;
	private String console2;
	
	//String enclosureSize, String typeOfEnclosure
	public String addEnclosureClicked() {
		System.out.println("Submit call");
		return "admin";
	}
	

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

	// Prime faces combo box

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}
	
	public String goToNewEnclosure() {
		enclosures = enclosureService.retrieveAllEnclosuresFromDataBase();
		return "newEnclosure";
	}

	public String getConsole2() {
		return console2;
	}

	public void setConsole2(String console2) {
		this.console2 = console2;
	}
	
}
