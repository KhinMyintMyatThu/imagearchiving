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

import service.SearchService;

@Path("search")
public class SearchPhotoResource {

	/**
	 * Response photoids matched with keyword you searched
	 * @param typedString
	 * @return
	 */
	@GET
	@Path("/keywordsearch/{typedString}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchByKeyword(@PathParam("typedString")String typedString) {
		List<Integer> photoIds=new ArrayList<Integer>();
		SearchService service=new SearchService();
		
		try {
			photoIds=service.searchByKeyword(typedString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity("The photoIds match with keyword you searched are: "+photoIds).build();
	}
	/**
	 * Response photoids matched with uploaded people you searched
	 * @param typedString
	 * @return
	 */
	
	@GET
	@Path("/peoplesearch/{typedString}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchByUploadPeople(@PathParam("typedString")String typedString) {
		List<Integer> photoIds=new ArrayList<Integer>();
		SearchService service=new SearchService();
		
		try {
			photoIds=service.searchByPeople(typedString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity(photoIds).build();
	}
	
	/**
	 * Response photoIds matched with tagged people you searched
	 * @param typedString
	 * @return
	 */
	
	@GET
	@Path("/taggedpeoplesearch/{typedString}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchByTaggedPeople(@PathParam("typedString")String typedString) {
		List<Integer> photoIds=new ArrayList<Integer>();
		SearchService service=new SearchService();
		
		try {
			photoIds=service.searchByTagPeople(typedString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity(photoIds).build();
	}

}
