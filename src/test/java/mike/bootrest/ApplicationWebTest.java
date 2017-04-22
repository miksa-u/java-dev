package mike.bootrest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootConfiguration
//@WebAppConfiguration
public class ApplicationWebTest {

	@Test
	public void home() {
		RestTemplate template = new RestTemplate();
		Greet greet = template.getForObject("http://localhost:8080", Greet.class);
		
		Assert.assertEquals("Hello Greet!", greet.text);
	}

}
