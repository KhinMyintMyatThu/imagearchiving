package rest;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.Photo;
import service.DetailPhotoService;

@Path("/photodetail")
public class PhotoDetailResource {
	
	/**
	 * Response selected photo in detail
	 * @param photoId
	 * @return
	 */
	@GET
	@Path("{photoId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPhotoDetail(@PathParam("photoId")int photoId) {
		Photo photo=new Photo();
		DetailPhotoService service=new DetailPhotoService();
		try {
			photo=service.selectPhotoDetail(photoId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Response.status(200).entity(photo).build();
	}
}
