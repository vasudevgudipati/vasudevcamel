package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


// TODO: Enable the route by extending the RouteBuilder superclass
@Component
public class TCPServerRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("netty:tcp://0.0.0.0:5548?sync=true&textline=true")
         .process(new com.example.demo.processors.MessageProcessor()); 
	}

    // TODO: Implement the configure method
    
}
