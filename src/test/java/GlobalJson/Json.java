package GlobalJson;

import io.restassured.path.json.JsonPath;

public class Json {
	
	public JsonPath GlobalJson(String response)
	{
		JsonPath jss = new JsonPath(response);
		return jss;
	}

}
