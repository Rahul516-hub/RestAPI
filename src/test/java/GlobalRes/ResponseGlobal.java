package GlobalRes;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseGlobal {
	
	private ResponseSpecification res;
	
	public ResponseSpecification Response()
	{
		res =  new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
		
		return res;
		
		
	}
	

}
