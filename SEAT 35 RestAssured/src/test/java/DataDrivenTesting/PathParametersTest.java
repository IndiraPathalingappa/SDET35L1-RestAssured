package DataDrivenTesting;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParametersTest {

	
	@Test
	public void pathParameter() {
		
		baseURI="http://localhost";
		port=8084;
		
		
		given()
		 .pathParam("pid","TY_PROJ_1405")
		.when()
		 .get("/projects/{pid}")
		.then().log().all(); 
		
	}
}
