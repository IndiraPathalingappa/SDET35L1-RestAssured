package DifferentwaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;


public class CreateProjectUsingJSONFileTest {
	
	@Test
	public void createProjectUsingJSONFile() {
		
		baseURI="http://localhost";
		port=8084;
		
			
		//create the required body 
		File file = new File(".\\RestTest\\Testdata.json");
		
		//send the request body and validate
		given()
		 .body(file)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().log().all();
	}

}
