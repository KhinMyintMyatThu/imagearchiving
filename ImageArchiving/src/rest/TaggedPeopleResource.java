package rest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.User;
import service.DetailPhotoService;

@Path("/taggedpeople")
public class TaggedPeopleResource {
	@GET
	@Path("{userId}/{photoId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTaggedPeopleInPhoto(@PathParam("userId")int userId,@PathParam("photoId")int photoId) {
		List<User> users=new ArrayList<User>();
		DetailPhotoService service=new DetailPhotoService();
		
		try {
			users=service.selectTagPeople(userId, photoId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity(users).build();
	}
}
