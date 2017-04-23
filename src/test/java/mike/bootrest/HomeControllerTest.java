package mike.bootrest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootConfiguration
//@WebAppConfiguration
public class HomeControllerTest {

	private final String SERVER_URL = "http://localhost:8088";
	
	@Test
	public void home() {
		RestTemplate template = new RestTemplate();
	
		String page = template.getForObject(SERVER_URL, String.class);
		
		Assert.assertTrue(page.startsWith("<html>"));
	}

	@Test
	public void greet() {
		RestTemplate template = new RestTemplate();
	
		Greet greet = template.getForObject(SERVER_URL, Greet.class);
		
		Assert.assertEquals("Hello New Greet!", greet.text);
	}

}
