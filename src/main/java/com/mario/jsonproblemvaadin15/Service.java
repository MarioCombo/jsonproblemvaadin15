package com.mario.jsonproblemvaadin15;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Path("/api")
@Produces(MediaType.APPLICATION_JSON  + ";charset=utf-8")
public class Service {

	@GetMapping("api/get")
	public Entity read() {
		return new Entity();
	}
}
