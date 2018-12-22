package com.bakingbitsstudios.resources;

import com.bakingbitsstudios.data.Host;
import com.bakingbitsstudios.persistence.HostDao;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * This is a resource class which is the RESTful service with endpoints.
 */
@Path("/hosts")
public class HostService {
    // TODO: Handle host not found scenarios

    public HostService() {

    }

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public List<Host> listHosts() {
        return HostDao.GetAllHosts();
    }

    @POST
    @Timed
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Host createHost(Host host) {
        return HostDao.CreateHost(host);
    }

    @GET
    @Timed
    @Path("/{hostId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Host getHost(@PathParam("hostId") String hostId) {
        return HostDao.GetHostById(hostId);
    }

    @PUT
    @Timed
    @Path("/{hostId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Host updateHost(@PathParam("hostId") String id, Host host) {
        return HostDao.UpdateHost(id, host);
    }

    @DELETE
    @Timed
    @Path("/{hostId}")
    public void deleteHost(@PathParam("hostId") String id) {
        HostDao.DeleteHost(id);
    }
}
