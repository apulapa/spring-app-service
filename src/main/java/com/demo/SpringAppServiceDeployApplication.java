package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class SpringAppServiceDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppServiceDeployApplication.class, args);
	}
	
	@GetMapping("/get")
	public String get()
	{
		return "Application Deployed in the Azure App Service";
	}

}
