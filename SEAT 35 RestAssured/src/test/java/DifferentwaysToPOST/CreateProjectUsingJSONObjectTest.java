package DifferentwaysToPOST;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.Random;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONObjectTest {
	
	
	@Test
	public void createProjectUsingJSONObject() {
	
		
		
		baseURI="http://localhost";
		port=8084;
		
		Random random = new Random();
		int rnd = random.nextInt();
		
		//step 1:create the required data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Tesawsini");
		jobj.put("projectName", "sevey"+rnd);
		jobj.put("status", "on going");
		jobj.put("teamSize", 17);
		
		
		//sept 2: send the request and validate
		given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().statusCode(201).log().all();
		
		
	}

}
