package com.acme.doktoric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class FlumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlumeApplication.class, args);
	}

}
