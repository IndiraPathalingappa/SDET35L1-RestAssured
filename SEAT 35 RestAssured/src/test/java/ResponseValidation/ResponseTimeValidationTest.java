package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidationTest {
	
	@Test
	public void responseTimeValidation() {
		
		baseURI="http://localhost";
		port=8084;
		
		Response resp = when().get("/projects");
		
		
		//Hamcrest Matchers = is the tool which helps to validate the response time
		//Hamcrest matchers has class called matchers which has methods like lessthan()
		//greaterthan(), lessthanorEqualto()
		
		resp.then().assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS);
	}

}
