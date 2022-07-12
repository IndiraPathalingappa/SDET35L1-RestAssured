package CRUDoperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateTheProjectTest {
	
	@Test
	public void updateTheProject() {
		
		baseURI="http://localhost";
		port=8084;
		
            //step 1: create the required data
		      JSONObject jobj = new JSONObject();
		      jobj.put("createdBy", "Amma");
		      jobj.put("projectName", "BHEL");
		      jobj.put("status", "completed");
		      jobj.put("teamSize", 25);
		      
		      //send the request  body
		      given()
		       .body(jobj)
		       .contentType(ContentType.JSON)
		      .when()
		       .put("/projects/TY_PROJ_1804")
		      .then()
		       .assertThat().statusCode(200).log().all();
	}

}
