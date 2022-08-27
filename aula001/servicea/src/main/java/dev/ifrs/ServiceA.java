package dev.ifrs;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/servicea")
public class ServiceA {

    // CDI
    @Inject
    @RestClient
    Client client;

    @GET
    @Path("/sum/{a}/{b}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public int sum(@PathParam("a") int a, @PathParam("b") int b) {
        return client.sum(a, b);
    }
}