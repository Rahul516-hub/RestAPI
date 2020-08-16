package GlobalReq;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class RequestGloba{

	private static RequestSpecification req;
	
	public RequestSpecification Request() throws FileNotFoundException
	{
		
	if(req==null)
	{
	PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
	 req = new RequestSpecBuilder().addQueryParam("key", "qaclick123").setBaseUri("https://rahulshettyacademy.com")
			.addHeader("Content-type", "application/json").addFilter(RequestLoggingFilter.logRequestTo(log))
			.addFilter(ResponseLoggingFilter.logResponseTo(log)).build();
	
	return req;
	}
	return req;
	
	}
	

}
