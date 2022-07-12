package ResponseValidation;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidationTest {

	@Test
	public void dynamicResponseValidation() {

		baseURI="http://localhost";
		port= 8084;

		String exptData="TY_PROJ_3206";

		//send the request 
		Response resp = when().get("/projects");

		//validate
		Boolean flag= false;
		List<String> list = resp.jsonPath().get("projectId");
		for (String s : list) {

			if (s.equalsIgnoreCase(exptData)) {
				flag=true;  //flag rising
				break;

			}
		}

		Assert.assertTrue(flag);

	}

}
