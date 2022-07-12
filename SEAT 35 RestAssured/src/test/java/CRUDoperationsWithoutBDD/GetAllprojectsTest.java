package CRUDoperationsWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllprojectsTest {
	
	@Test
	public void getAllProjectsTest() {
		
		//step 1:create a request body
		//step 2:send the response
		Response resp = RestAssured.get("http://localhost:8084/projects");
		//step 3:validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
