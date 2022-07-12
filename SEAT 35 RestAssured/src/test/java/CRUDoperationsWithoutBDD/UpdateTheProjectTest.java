package CRUDoperationsWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateTheProjectTest {
	
	@Test
	public void updateTheProjectTest() {
		
		//step 1: create the request body
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "abcibj1");
		jobj.put("projectName", "Tyss1");
		jobj.put("status", "completed1");
		jobj.put("teamSize", 123);
		
		
		//step 2:send the request
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_2409");
	
		
		//step 3:validate the response
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
