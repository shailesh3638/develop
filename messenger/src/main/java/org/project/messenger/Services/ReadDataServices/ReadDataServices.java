package org.project.messenger.Services.ReadDataServices;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.project.messenger.Models.User;

@Consumes({MediaType.APPLICATION_JSON}) 
@Produces({MediaType.APPLICATION_JSON})
public interface ReadDataServices {

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/xyz")
public User getUser();
}	


