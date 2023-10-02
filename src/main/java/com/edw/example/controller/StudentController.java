package com.edw.example.controller;

import com.edw.example.service.StudentService;
import jakarta.inject.Inject;
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
 *     com.edw.example.controller.StudentController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 02 Okt 2023 09:22
 */
@Path("/student")
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Inject
    StudentService studentService;

    @GET
    @Path("/get-all")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getAll() {
        return Response
                .status(200)
                .entity(studentService.getAll())
                .build();
    }

}
