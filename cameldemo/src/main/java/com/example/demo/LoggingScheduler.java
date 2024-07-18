package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class LoggingScheduler extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer:Logtimer?period=10000")
		.routeId("logging Route")
		.log("Hello WOrld :: Logging every 10 seconds");
	}

}
