package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidationTest {
	
	@Test
	public void staticResponseValidation() {
		
		baseURI="http://localhost";
		port=8084;
		
		String expData = "TY_PROJ_1002";
		//create the data
		//send the request
		Response resp = when().get("/projects");
		
		//validation
		String actData = resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(expData,actData);
		resp.then().log().all();
		
		
	}

}
