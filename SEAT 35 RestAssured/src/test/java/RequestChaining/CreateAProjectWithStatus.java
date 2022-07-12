package RequestChaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import ProjectLibrary.ProjectLibrary1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CreateAProjectWithStatus {

	@Test
	public void createAProjectWithStatus() {

		//generate a random number 
		
		Random random = new Random();
		int rnd = random.nextInt(300);

		//declare the basicurl and port number to utilize
		baseURI="http://localhost";
		port= 8084;

		//create the object of pojo class and initilize the variables
		ProjectLibrary1 prj = new ProjectLibrary1("Pathu", "HMT-"+rnd, "created", 5);

		//send the request body to add the project to server
		Response resp = given()
				.body(prj)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");
		
		//using json path retrive the project id
		String sop = resp.jsonPath().get("projectId");
		System.out.println(sop);
		
		//set the path parameter to get the project
		 given()
		.pathParam("sts", sop)
		.when().get("/projects/{sts}")
		.then().assertThat().log().all();
		
		 //change the status code for same project
		prj.setStatus("completed");
		
		given()
		.pathParam("prjID", sop)
		.body(prj)
		.contentType(ContentType.JSON)
		.when().put("/projects/{prjID}")
		.then().log().all();
				
		 }

}

