package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//Enable Discovery Service
@EnableEurekaClient
//Calling Another web services
@EnableFeignClients("com.example.hello")
public class S1Application {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		RestTemplate restTemplate =  new RestTemplate();
		return restTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(S1Application.class, args);
	}

}
