package com.bakingbitsstudios.resources;

import com.bakingbitsstudios.data.Host;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

/**
 * This is a resource class which is the RESTful service with endpoints.
 */
@Path("/hosts")
public class HostService {

    public HostService() {

    }

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public List<Host> listHosts() {
        // TODO: look up hosts in the data layer
        return Arrays.asList(new Host());
    }

    @POST
    @Timed
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Host createHost(Host host) {
        // TODO: create new host in the data layer
        return host;
    }

    @GET
    @Timed
    @Path("/{hostId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Host getHost(@PathParam("hostId") String hostId) {
        // TODO: look up host by id in the data layer
        return new Host();
    }

    @PUT
    @Timed
    @Path("/{hostId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Host updateHost(@PathParam("hostId") String id, Host host) {
        // TODO: update host in the data layer
        return new Host();
    }

    @DELETE
    @Timed
    @Path("/{hostId}")
    public void deleteHost(@PathParam("hostId") String id) {
        // TODO: delete host in the data layer
    }
}
