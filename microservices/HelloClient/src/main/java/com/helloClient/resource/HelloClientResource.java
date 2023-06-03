package com.helloClient.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/api/client")
public class HelloClientResource {
	
@Autowired
RestTemplate template;

@GetMapping
public String callServer() {
	//String url="http://localhost:8094/rest/server";
//	String url="http://localhost:8093/rest/service/status";
	String url="http://localhost:8093/bill/service/status";
    String output=template.getForObject(url,String.class); 
//    getForObject is to get the url from other microservice ..
    return output;
}
}
