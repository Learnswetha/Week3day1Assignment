package SimpleRestProgram;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_Change_Request {
     @Test
	public void changerequest(){
		//Enter the End point
		RestAssured.baseURI="https://dev116510.service-now.com/api/now/table/";
		
		//Give Authorization
		RestAssured.authentication=RestAssured.basic("admin", "Ngpe$1UnA9=A");
		
		// Specify the Header for content type
	RequestSpecification inputRequest=RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"description\": \"added\",\r\n"
				+ "    \"short_description\": \"Change Request\"\r\n"
				+ "}");
		
		//Send the Request
	Response response= inputRequest.post("change_request");
	response.prettyPrint();
	}
		
	
}
