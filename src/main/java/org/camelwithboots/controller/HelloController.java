package org.camelwithboots.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	ProducerTemplate producerTemplate;
	
	@RequestMapping("/")
	public void startCamel(){
		producerTemplate.sendBody("direct:firstRoute", "i am from controller");
	}
}
