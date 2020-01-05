package com.example.hello;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="s2", url="localhost:8091")
@FeignClient(name="apigateway")
@RibbonClient(name="s2")
public interface S2Proxy {
	
	@GetMapping("s2/s2/bye")
	public String s2Bye();
}
