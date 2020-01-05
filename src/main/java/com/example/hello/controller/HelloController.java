package com.example.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.hello.S2Proxy;
import com.example.hello.bean.HelloBean;

@RestController
@RequestMapping(path = "/s1")
public class HelloController {
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	S2Proxy s2Proxy;

	@GetMapping(path = "/hello")
	public HelloBean sayHello() {
		String bye = s2Proxy.s2Bye();
		//HelloBean responseEntity = restTemplate.getForObject("http://s2/s2/bye", HelloBean.class);
		//responseEntity.setHi("Hi");
		HelloBean helloBean = new HelloBean();
		helloBean.setHi("hi");
		helloBean.setText(bye);
		return helloBean;
	}
}
