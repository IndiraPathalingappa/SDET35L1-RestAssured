package CRUDoperationsWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteTheProjectTest {

	@Test
	public void deleteTheProjectTest() 
	{
		//step 1:create the required body
		//step 2:send the request
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_232");
		//step 3:validate the response
		System.out.println(resp.getStatusCode());
		ValidatableResponse validate = resp.then();
		validate.log().all();
		
	}
}
