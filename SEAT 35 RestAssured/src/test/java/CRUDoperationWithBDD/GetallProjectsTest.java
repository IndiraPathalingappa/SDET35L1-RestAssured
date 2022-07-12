package CRUDoperationWithBDD;

import org.apache.http.impl.client.TargetAuthenticationStrategy;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetallProjectsTest {
	
	@Test
	public void getAllProjects() {
		
		baseURI="http://localhost";
		port=8084;
		
		//step 1: create the required data
		//send the request body
		when()
		 .get("/projects")
		.then()
		 .assertThat().statusCode(200).log().all();
		
		
	}

}
