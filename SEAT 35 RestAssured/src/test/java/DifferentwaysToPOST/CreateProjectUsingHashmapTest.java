package DifferentwaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

public class CreateProjectUsingHashmapTest {
	
	@Test
	public void createProjectUsingHashmap() {
		
		
		baseURI="http://localhost";
		port=8084;
		
		Random random = new Random();
		int rnd = random.nextInt();
		
		//step 1:create the required data
		HashMap hmap = new HashMap();
		hmap.put("createdBy", "praneeth");
		hmap.put("projectName", "BEL"+rnd);
		hmap.put("status", "on going");
		hmap.put("teamSize", 19);
		
		
		//step 2:send the request and validated
		given()
		 .body(hmap)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().log().all();
		
	}

}
