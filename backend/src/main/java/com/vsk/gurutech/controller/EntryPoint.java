package com.vsk.gurutech.controller;

import com.vsk.gurutech.config.InHealthConfig;
import com.vsk.gurutech.service.BaseService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/entry")
public class EntryPoint {

    public final BaseService baseService = InHealthConfig.getBaseService();

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public String test() {
        return baseService.getData();
    }

}
