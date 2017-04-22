package mike.bootrest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public  class Greet {
	public String text;
	
	public Greet() {}
	
	public Greet(String text) {
		this.text = text;
	}
}
