package com.revature.DemoREST_WS_Jersey;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.revature.DemoREST_WS_Jersey.Alien;
import com.revature.DemoREST_WS_Jersey.AlienRepository;

@Path("aliens")
public class AlienResource {
	
	AlienRepository repo = new AlienRepository();

	// Get all aliens
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		return repo.getAliens();
	}
	
	// Get specific alien
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien getAlien(@PathParam("id") int id) {
		return repo.getAlien(id);
	}
	
	// Add alien
	@POST
	@Path("alien")
	public Alien createAlien(Alien a) {
		System.out.println(a.toString());
		repo.create(a);
		
		return a;
	}
	
}
