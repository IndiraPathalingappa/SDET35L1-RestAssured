package EndToEndScenario;

import static io.restassured.RestAssured.given;

import java.sql.SQLException;

import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointLibrary;
import ProjectLibrary.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateAProjectAndVerifyItInDB extends BaseAPIClass {

	
	@Test
	public void createAProjectAndVerifyItInDBTest() throws SQLException 
	{
		//Step 1: create project using post()
		ProjectLibrary pLib = new ProjectLibrary("Indira.P", "RMG-"+jLib.getRandomNumber(), "Created", 16);
		
		Response resp = given()
						.body(pLib)
						.contentType(ContentType.JSON)
						.when()
						.post(EndPointLibrary.CreateProject);
		
		
		//step 2: capture the project id from response
		String proId = rLib.getJSONData(resp, "projectId");
		System.out.println(proId);
		
		//Step 3: use it in get request
		given()
		  .pathParam("pid", proId)
		.when()
		  .get(EndPointLibrary.GetSingleProject)
		.then().log().all();
		
		
		//Step 4: verify it in database
		String query = "select * from project";
		String data = dLib.executeQueryAndReturnData(query, 1, proId);
		System.out.println(data);
		
	}

}

