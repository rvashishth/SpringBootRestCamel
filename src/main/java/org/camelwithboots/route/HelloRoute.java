package org.camelwithboots.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		System.out.println("String route configuration");
		from("direct:firstRoute").log("camel body: ${body}");
	}

}
