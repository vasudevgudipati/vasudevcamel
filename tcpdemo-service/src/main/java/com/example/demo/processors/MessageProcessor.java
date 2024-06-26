package com.example.demo.processors;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MessageProcessor implements Processor {

	 @Override
	    public void process(Exchange exchange) throws Exception {
	        String body = exchange.getIn().getBody(String.class);
	        System.out.println("Received message: " + body);
	        String[] parts = body.split("\\|");
	        
	        StringBuilder response = new StringBuilder();
	        for (int i = 0; i < parts.length; i++) {
	            response.append("M").append(i + 1).append("=")
	                    .append(parts[i]);
	            if (i < parts.length - 1) {
	                response.append("\r\n"); 
	            }
	        }
	        System.out.println("Response to send: " + response.toString());
	        exchange.getMessage().setBody(response.toString());
	    }

}
