package webpackage.other;

import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Animal {
	private String name;
	private List<String> animals;
	
	public String getName() {
		return name;
	}

	public List<String> getAnimals() {
		return animals;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAnimals(List<String> animals) {
		this.animals = animals;
	}

}
