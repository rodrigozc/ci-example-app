package br.com.kroton.example.ci;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import br.com.kroton.example.ci.services.VersionApi;

@Configuration
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
        register(VersionApi.class);
    }
}
