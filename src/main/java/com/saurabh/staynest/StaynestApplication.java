package com.saurabh.staynest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StaynestApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaynestApplication.class, args);
	}

}
