package DifferentwaysToPOST;

import org.testng.annotations.Test;

import ProjectLibrary.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectUsingPOJOTest {
	
	@Test
	public void createProjectUsingPojo() {
		
		Random random = new Random();
		int rnd = random.nextInt(200);
		System.out.println(rnd);
		
		//baseURI="http://localhost";
		//port=8084;
		
			
		// step 1:create an object of pojo class and initilize
		ProjectLibrary p = new ProjectLibrary("indu", "tys-"+rnd, "Created", 2);
		
		
		//step 2:send the request body and validate
		given()
		 .body(p)
		 .contentType(ContentType.JSON)
		.when()
		 .post("http://localhost:8084/addProject")
		.then()
		 .log().all();
	}

}
