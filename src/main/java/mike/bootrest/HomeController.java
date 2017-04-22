package mike.bootrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import java.lang.String;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "<html><title>Home</title><body><h2>Home</h2></body></html>";
	}

	@RequestMapping("/greet")
	public Greet greet() {
		return new Greet("Hello New Greet!");
	}
}
