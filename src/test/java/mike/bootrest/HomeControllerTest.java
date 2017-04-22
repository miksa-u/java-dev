package mike.bootrest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootConfiguration
//@WebAppConfiguration
public class HomeControllerTest {

	@Test
	public void home() {
		RestTemplate template = new RestTemplate();
		String page = template.getForObject("http://localhost:8080", String.class);
		
		Assert.assertTrue(page.startsWith("<html>"));
	}

	@Test
	public void greet() {
		RestTemplate template = new RestTemplate();
		Greet greet = template.getForObject("http://localhost/greet:8080", Greet.class);
		
		Assert.assertEquals("Hello New Greet!", greet.text);
	}

}
