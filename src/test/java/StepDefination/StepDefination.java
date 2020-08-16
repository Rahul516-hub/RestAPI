package StepDefination;

import static io.restassured.RestAssured.given;

import Deserialization.GetAddPlaceAllObjects;
import EnumConstants.GlobalEnum;
import GlobalDeleteBody.DeleteBody;
import GlobalDeleteBody.OverallDelete;
import GlobalJson.Json;
import GlobalReq.RequestGloba;
import GlobalRes.ResponseGlobal;
import GlobalSerialization.Serialize;
import Serialization.SetAddPlaceAllObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;

public class StepDefination extends Serialize {

	private static DeleteBody dbz;
	private static String delete;
	private static String place_id;
	private static RequestSpecification reqq;
	private static ResponseSpecification ress;
	private static RequestGloba RG;
	private static Response rs;
	private static ResponseGlobal RSG;
	private OverallDelete db;
	private GetAddPlaceAllObjects gapao;
	private String get;
	private Json Globaljs;
	private JsonPath js;
	private String put;
	private GlobalEnum resourcesAPI;
	private SetAddPlaceAllObjects sapao;
	private String updateddelete;

	@And("^in response \"([^\"]*)\" should have \"([^\"]*)\"$")
	public void in_response_something_should_have_something(String key, String value) throws Throwable {

		String respons = reqq.when().post(resourcesAPI.GetResource()).then().spec(ress).assertThat().statusCode(200)
				.extract().response().asString();

		Globaljs = new Json();

		js = Globaljs.GlobalJson(respons);

		Assert.assertEquals(js.get(key), value);

		place_id = js.get("place_id");

	}

	@Then("^Message \"([^\"]*)\" should get displayed$")
    public void message_something_should_get_displayed(String strArg1) throws Throwable {
       
		
		System.out.println(strArg1);
    }

	@Then("^status code (\\d+) should get dispayed$")
	public void status_code_should_get_dispayed(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		rs = reqq.when().post(resourcesAPI.GetResource()).then().spec(ress).assertThat().statusCode(200).extract()
				.response();
		Assert.assertEquals(rs.statusCode(), arg1);
		System.out.println(rs.statusCode());

	}

	@Given("^User calls the api with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_calls_the_api_with(String name, String language, String address, String website,
			String phone_number) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		RG = new RequestGloba();

		reqq = RG.Request();

		sapao = Serialization(55, name, language, address, website, phone_number);

		reqq = given().spec(reqq).body(sapao);

	}

	@Given("^user calls the api with providing all details$")
	public void user_calls_the_api_with_providing_all_details() throws Throwable {

		db = new OverallDelete();

		dbz = db.OD(place_id);

		reqq = given().spec(reqq).body(dbz);
		
		

	}

	@When("^user hits the API$")
    public void user_hits_the_api() throws Throwable {
        
		rs = reqq.when().post("/maps/api/place/delete/json").then().spec(ress).assertThat().statusCode(200).extract()
				.response();
       
	    System.out.println(rs.getStatusCode());
	
	

	}
	
	@When("^user hits the \"([^\"]*)\" with \"([^\"]*)\" http request$")
	public void user_hits_the_something_with_something_http_request(String resource, String method) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		resourcesAPI = GlobalEnum.valueOf(resource);

		System.out.println(resourcesAPI.GetResource());

		RSG = new ResponseGlobal();

		ress = RSG.Response();

		if (method.equalsIgnoreCase("POST")) {
			gapao = reqq.when().post(resourcesAPI.GetResource()).then().spec(ress).assertThat().statusCode(200)
					.extract().response().as(GetAddPlaceAllObjects.class);
		} else if (method.equalsIgnoreCase("DELETE")) {
			delete = reqq.when().delete(resourcesAPI.GetResource()).then().spec(ress).assertThat().statusCode(200)
					.extract().response().asString();
		} else if (method.equalsIgnoreCase("GET")) {

			get = reqq.when().get(resourcesAPI.GetResource()).then().spec(ress).assertThat().statusCode(200).extract()
					.response().asString();

		}

		else {
			put = reqq.when().put(resourcesAPI.GetResource()).then().spec(ress).assertThat().statusCode(200).extract()
					.response().asString();
		}
	}
	
	@And("^verify place_id created maps to \"([^\"]*)\" using \"([^\"]*)\"$")
	public void verify_placeid_created_maps_to_something_using_something(String name, String resource)
			throws Throwable {

		reqq = given().spec(reqq).queryParam("place_id", place_id);

		user_hits_the_something_with_something_http_request(resource, "GET");

		JsonPath js1 = Globaljs.GlobalJson(get);

		System.out.println(get);
		Assert.assertEquals(js1.get("name"), name);

		System.out.println(
				"All details required to prove that get API executed perfectly has been completed successfully");

	}
}
