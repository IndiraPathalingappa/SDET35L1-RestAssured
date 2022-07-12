package CRUDoperationsWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSingleProjectTest {
	
	@Test
	public void getSingleProjectTest() {
		
		//step 1: create a request body
		//step 2: send the request
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_2409");
		//step 3:validate the response
		System.out.println(resp.getStatusCode());
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
