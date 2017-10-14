package rest;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.User;
import service.LoginService;

@Path("/login")
public class LoginResource {
	
	/**
	 * Response Login user data
	 * @param email
	 * @param password
	 * @return
	 */
	@GET
	@Path("{email}/{password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLoginUser(@PathParam("email") String email,@PathParam("password") String password){
		User user=new User();
		LoginService service=new LoginService();
		try {
			user=service.isLoginUser(email, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Response.status(200).entity(user).build();
	}
}
