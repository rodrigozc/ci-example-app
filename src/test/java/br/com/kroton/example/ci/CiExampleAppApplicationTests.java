package br.com.kroton.example.ci;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import br.com.kroton.example.ci.services.VersionApi;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CiExampleAppApplicationTests {

	@Autowired
  private VersionApi versionApi;

	@Test
	public void contextLoads() {
	}

	@Test
	public void get_version_successfully() throws Exception{
		this.versionApi.getVersion();
	}

}
