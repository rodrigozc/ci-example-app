package br.com.kroton.example.ci.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import br.com.kroton.example.ci.models.Version;

@Component
@Path("/version")
@PropertySource("file:./application.properties")
public class VersionApi {
	
	@Value("${version.major}")
	private int major;
	
	@Value("${version.minor}")
	private int minor;
	
	@Value("${version.maintenance}")
	private int maintenance;
	
	@Value("${version.build}")
	private int build;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Version getVersion() {
		Version version = new Version();
		version.setMajor(this.major);
		version.setMinor(this.minor);
		version.setMaintenance(this.maintenance);
		version.setBuild(this.build);
		return version;
	}

}
