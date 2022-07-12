package CRUDoperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetSingleProjectTest {
	
	@Test
	public void getSingleProjectTest() {
		
		
		baseURI="http://localhost";
		port=8084;
		
		//step 1:create the required data
		//step 2:send the request body and validate
		when()
		 .get("/projects/TY_PROJ_1405")
		.then()
		 .assertThat().statusCode(200).log().all();
	}

}
