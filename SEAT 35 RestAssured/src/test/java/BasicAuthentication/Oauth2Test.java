package BasicAuthentication;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2Test {
	
	@Test
	public void oauth2Test() {
		
		baseURI="http://coop.apps.symfonycasts.com";
		
		
		//step 1:create post request with ClientID And Client Password
		 Response reps = given()
		  .formParam("client_id", "SDETTYSS35L1")
		  .formParam("client_secret", "9e2a94fe0ad7f473d65a1abb3fe63a91")
		  .formParam("grant_type", "client_credentials")
		  .formParam("redirect_uri", "http://example.com")
		  .formParam("code", "authorization_code")
		.when()
		 .post("/token");
		 
		
		
		//Step 2: Capture the access from the response
		 String token = reps.jsonPath().get("access_token");
		 Reporter.log(token,true);
		
		//step 3: use that token to access any Apis 
		 
		 given()
		  .auth().oauth2(token)
		  .pathParam("USER_ID", 3544)
		  .when()
		   .post("/api/{USER_ID}/eggs-count")
		   .then().log().all();
		   
		
	}

}
