
package webpackage;

import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import domainpackage.AnimalService;
import webpackage.other.Animal;

@ManagedBean
public class AnimalController {

	private List<Animal>		animals;
	@Inject
	private AnimalService	animalService;

	public String showAnimalsClicked() {
		animals = animalService.retrieveAllAnimalsFromDataBase();
		return "Show";
	}
	
	public List<Animal> getAnimals() {
		return animals;
	}

	public AnimalService getAnimalService() {
		return animalService;
	}

	public void setAnimals(List<Animal> Animals) {
		this.animals = Animals;
	}

	public void setAnimalservice(AnimalService Animalservice) {
		this.animalService = Animalservice;
	}
}
