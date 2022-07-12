package CRUDoperationsWithoutBDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {

	@Test
	public void createProjectTest()
	{
		//create random number
		Random random = new Random();
		int rnd = random.nextInt();
		
		//step 1:Create a required body
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Indira");
		jobj.put("projectName", "xfgdj-"+rnd);
		jobj.put("status", "completed");
		jobj.put("teamSize", 12+rnd);
		
		
		//step 2: send the request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response response = req.post("http://localhost:8084/addProject");
	
		
		//step 3:validate the response
		
		System.out.println(response.prettyPeek());
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		ValidatableResponse validate = response.then();
		validate.log().all();
	}
	
}
