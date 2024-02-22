package com.charan.hotelDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.charan")
public class HotelDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelDemoApplication.class, args);
	}

}
