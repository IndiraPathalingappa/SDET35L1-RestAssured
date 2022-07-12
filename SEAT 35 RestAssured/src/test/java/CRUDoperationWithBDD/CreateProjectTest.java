package CRUDoperationWithBDD;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectTest {
	
	@Test
	public void createProjectTest() {
		
		Random random = new Random();
		int rnd = random.nextInt();
				
		//step 1: create the required data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Gowthami");
		jobj.put("projectName", "BEL"+rnd);
		jobj.put("status", "completed");
		jobj.put("teamSize", 20);
		
		//send the request body
		given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		.when()
		  .post("http://localhost:8084/addProject")
		 .then()
		  .assertThat().statusCode(201).log().all();
	}

}
