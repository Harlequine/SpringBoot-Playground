package com.harlequine.MoviesAPI;

import org.springframework.boot.SpringApplication;// this class has a method that runs the spring application
import org.springframework.boot.autoconfigure.SpringBootApplication;


//annotations in java are usually used to let the compiler know what this class does
@SpringBootApplication
//@RestController // Lets the framework know that this is a Rest API controller and not just an ordinary class
public class MoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}

	 // Lets the framework that this method is an API endpoint
//	@ResponseBody
//	@GetMapping("/root")
//	public String apiRoot(){
//		return "hello world";
//	}

}
