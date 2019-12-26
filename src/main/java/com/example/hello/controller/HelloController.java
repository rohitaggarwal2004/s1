package com.example.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.hello.bean.HelloBean;

@RestController
@RequestMapping(path = "/s1")
public class HelloController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping(path = "/hello")
	public HelloBean sayHello() {
		HelloBean responseEntity = restTemplate.getForObject("http://s2/s2/bye", HelloBean.class);
		responseEntity.setHi("Hi");
		return responseEntity;
	}
}
