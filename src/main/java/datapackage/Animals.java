package datapackage;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import tools.Element;

/**
 * Entity implementation class for Entity: Animals
 *
 */
@Entity
public class Animals implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String name;
	private int minSurface;
	private int weight;
    private Element elem;
    
    
    public int getMinSurface() {
		return minSurface;
	}

	public void setMinSurface(int minSurface) {
		this.minSurface = minSurface;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Element getElem() {
		return elem;
	}

	public void setElem(Element elem) {
		this.elem = elem;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
	public String getName() {		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
