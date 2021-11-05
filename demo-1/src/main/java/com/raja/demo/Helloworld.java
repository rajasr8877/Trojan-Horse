package com.raja.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	@RequestMapping("/hello")
	public String hell()
	{
		return "Hello World Spring Project ";
	}

}
