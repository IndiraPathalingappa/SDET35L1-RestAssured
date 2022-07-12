package BasicAuthentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BarerToken {
	
	@Test
	public void barerTokenTest() {
		
		baseURI="https://api.github.com";
		
		JSONObject Jsob = new JSONObject();
		Jsob.put("name", "SDET35L1-RestAssured");
		Jsob.put("description", "RestFull webServices FW Testing");
		
		given()
		 .auth()
		 .oauth2("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")
		 .body(Jsob)
		 .contentType(ContentType.JSON)
		.when().post("/user/repos") 
		.then()
		 .assertThat().statusCode(201).log().all();
		
	}

}
