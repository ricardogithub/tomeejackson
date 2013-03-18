package simple;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/produce")
@Produces({"application/json"})
public class Producer {

	private static final String acl_allow_origin = "Access-Control-Allow-Origin";

	@GET
    public Response produce()
	{   
		System.out.println("produce aangeroepen"); 
		
		List<EmbeddedObject> embeddedObjectList = new ArrayList(); 
    	
		EmbeddedObject eo1 = new EmbeddedObject(100, 200); 
		EmbeddedObject eo2 = new EmbeddedObject(300, 400); 
    	
    	embeddedObjectList.add(eo1); 
    	//embeddedObjectList.add(eo2); 

    	ContainerObject json= new ContainerObject(1, embeddedObjectList);
		//String json = "Het werkt!!!"; 
    	
    	Response response = Response.ok(json).header(acl_allow_origin, "*").build();
    	
    	return response; 
    }
}
