package com.davidrus.shiokosho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ShioKoshoApplication extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShioKoshoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShioKoshoApplication.class, args);
	}
}
