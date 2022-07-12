package RequestChaining;

import org.testng.Assert;
import org.testng.annotations.Test;

import ProjectLibrary.ProjectLibrary1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateAProjectAndGet {
	
	@Test
	public void createAProjectAndGet() {
		
		Random random = new Random();
		int rnd = random.nextInt(500);
		
		
		
		baseURI="http://localhost";
		port=8084;
		
		// create a post request and capture the response
		ProjectLibrary1 proj = new ProjectLibrary1("Indu", "BHEL"+rnd, "completed", 5);
		
		Response resp = given()
		 .body(proj)
		 .contentType(ContentType.JSON)
		.when()
		  .post("/addProject");
				 
		
		//using jsonpath Retrive project Id From Response
		
		String pid = resp.jsonPath().get("projectId");
		System.out.println(pid);
			
		//use project ID for another Request
		
		given()
		 .pathParam("key", pid)
		 .when().get("/projects/{key}")
		.then().assertThat().statusCode(200).log().all();
		
		
		
	}
	
		
		 

}
