package CRUDoperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteTheProjectTest {
	
	@Test
	public void deleteTheProject() {
		
		baseURI="http://localhost";
		port=8084;
		
		
		//create the required data
		//send the request body and validate
		when()
		 .delete("/projects/TY_PROJ_1803")
		.then()
		 .assertThat().statusCode(204).log().all();
		
	}

}
