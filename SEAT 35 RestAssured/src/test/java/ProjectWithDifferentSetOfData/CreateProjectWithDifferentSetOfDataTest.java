package ProjectWithDifferentSetOfData;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ProjectLibrary.ProjectLibrary1;
import io.restassured.http.ContentType;
import pojoForComplexData1.PojoClassForComplexData;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithDifferentSetOfDataTest {
	
	
	
	@Test(dataProvider =  "projectWithDifferentData")
	public void createProjectWithDiffData(String createdBy,String projectName, String status,String teamSize) {
		
		Random radm = new Random();
		int rdm = radm.nextInt(200);
	
		
		baseURI="http://localhost";
		port= 8084;
		
		
		PojoClassForComplexData proj = new PojoClassForComplexData(createdBy ,projectName, status, teamSize);
				
		given()
		 .body(proj)
		 .contentType(ContentType.JSON)
	    .when()
		 .post("/addProject")
		.then().log().all();
				
	}
	
	@DataProvider
	public Object[][] projectWithDifferentData(){
		 Object[][] objarry = new Object[5][4];
		 
		Random radm = new Random();
		int rdm = radm.nextInt(200);
		 
		 objarry[0][0]="Asha";
		 objarry[0][1]="Hdfc-"+rdm;
		 objarry[0][2]="On going";
		 objarry[0][3]="5";
		 
		 objarry[1][0]="Gopi";
		 objarry[1][1]="Axis";
		 objarry[1][2]="completed-"+rdm;
		 objarry[1][3]="6";
		 
		 objarry[2][0]="Raju";
		 objarry[2][1]="Canara-"+rdm;
		 objarry[2][2]="Process";
		 objarry[2][3]="7";
		 
		 objarry[3][0]="Ravi";
		 objarry[3][1]="DCC-"+rdm;
		 objarry[3][2]="completed";
		 objarry[3][3]="8";
		 
		 objarry[4][0]="Teju";
		 objarry[4][1]="Edge-"+rdm;
		 objarry[4][2]="created";
		 objarry[4][3]="10";
		 
		return objarry;
	}
	 
	  

	
	

}
