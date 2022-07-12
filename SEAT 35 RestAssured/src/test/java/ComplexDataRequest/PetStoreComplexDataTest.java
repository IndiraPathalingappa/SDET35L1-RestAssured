package ComplexDataRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PetStoreComplexDataTest {

	@Test
	public void petStore(){
		
		
				
		JSONObject jcgry = new JSONObject();
		jcgry.put("id", 1);
		jcgry.put("name", "cat");
		
		JSONObject jpr=new JSONObject();
		jpr.put("name", "dog");
		jpr.put("photoUrls", "taken");
		
		JSONObject jtag=new JSONObject();
		jtag.put("id", 0);
		jtag.put("name", "Rabbit");
		
		
		JSONObject jsob=new JSONObject();
		jsob.put("category", jcgry);
		jsob.put("name",jpr );
		jsob.put("tags", jtag);
		
		
	}

}

