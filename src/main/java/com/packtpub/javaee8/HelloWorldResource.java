package com.packtpub.javaee8;
/* modification made at only_developers */
/* getting the remote modification */
/* getting the remote modification II */
/* setting the local modification I */
/* getting the remote modification III */
/* development fix */
/* development fix 2 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

import static java.util.Collections.singletonMap;

/**
 * The REST resource implementation class.
 */
@Path("hello")
public class HelloWorldResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        Map<String, String> response = singletonMap("message", "Building Web Services with Java EE 8.");
        return Response.ok(response).build();
    }
}
