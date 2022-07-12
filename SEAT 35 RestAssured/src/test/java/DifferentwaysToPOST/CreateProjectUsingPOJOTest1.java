package DifferentwaysToPOST;

import org.testng.annotations.Test;

import ProjectLibrary.ProjectLibrary1;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectUsingPOJOTest1 {
	
	@Test
	public void createProjectUsingPOJO() {
		
		Random rand = new Random();
		int rdn = rand.nextInt(200);
		
		baseURI="http://localhost";
		port= 8084;
		
		//create the obeject of pojo class
		ProjectLibrary1 pLib=new ProjectLibrary1("indu", "tyss-"+rdn, "completed", 5);
		
		//send request body and validate
		given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().statusCode(201).log().all();
	}

}
