package restpackage;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.Validator;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import domainpackage.AnimalService;
import webpackage.other.Animal;

@RequestScoped
@Path("/animals")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class AnimalResourceRestService {
	@Inject
    private Logger log;

    @Inject
    private Validator validator;

	@Inject
	private AnimalService animalService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Animal> listAllAnimals() {
        return animalService.retrieveAllAnimalsFromDataBase();
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String listAllAnimalsTextPlain() {
    	StringBuffer bf = new StringBuffer();
    	for (Animal  m  : animalService.retrieveAllAnimalsFromDataBase()) {
    		bf.append(m.getName());
    		bf.append("\n---\n");		
    	}
        return bf.toString();
    }
 
}
