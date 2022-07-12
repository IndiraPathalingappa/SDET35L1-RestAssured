package RequestChaining;

import org.testng.annotations.Test;

import ProjectLibrary.ProjectLibrary1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateAProjectAndDelete {
	
	@Test
	public void createAProjectAndDelete() {
		
		Random random = new Random();
		int rnd = random.nextInt(500);
		
		baseURI="http://localhost";
		port= 8084;
		
		ProjectLibrary1 proj = new ProjectLibrary1("Rathna", "xylem-"+rnd, "completed", 5);
		
		Response resp = given()
		 .body(proj)
		 .contentType(ContentType.JSON)
		 .when()
		  .post("/addProject");
		
		String pid = resp.jsonPath().get("projectId");
		System.out.println(pid);
		
		given()
		 .pathParam("key", pid)
		 .when().get("/projects/{key}")
		.then().assertThat().statusCode(200).log().all();
		
		given()
		 .pathParam("key", pid)
		 .when().delete("/projects/{key}")
		 .then().assertThat().statusCode(204).log().all();
	}

}
