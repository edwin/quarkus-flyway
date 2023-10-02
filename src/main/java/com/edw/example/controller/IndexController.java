package com.edw.example.controller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * <pre>
 *     com.edw.example.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 02 Okt 2023 08:42
 */
@Path("/")
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response index() {
        return Response
                .status(200)
                .entity(new HashMap<>(){{
                    put("hello", "world");
                }})
                .build();
    }
}
