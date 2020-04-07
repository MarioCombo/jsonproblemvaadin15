package com.mario.jsonproblemvaadin15;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.server.connect.VaadinConnectController;

@Configuration
public class VaadinEndpointMapperConfig {

	@Bean
	@Qualifier(VaadinConnectController.VAADIN_ENDPOINT_MAPPER_BEAN_QUALIFIER)
	public ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		//set own configurations if needed
		return mapper;
	}
}
