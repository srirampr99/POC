package com.ws.model;

import javax.xml.ws.Endpoint;

public class TestmartPublisher {
	
	public static void main(String[] args)
	{
		Endpoint.publish("http://localhost:2323/productcatalog", new ProductCatalog());
	}

}
