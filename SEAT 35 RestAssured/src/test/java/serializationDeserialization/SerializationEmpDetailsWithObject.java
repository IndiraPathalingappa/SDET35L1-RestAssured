package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialzationDeserialization.EmpDetailsWithObject;
import pojoForSerialzationDeserialization.Spouse;

public class SerializationEmpDetailsWithObject {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
			
		// step 1: create an object of phone and spouse
		int[] phno= {5966,96875};
		  Spouse sp = new Spouse("xyz", 8912, "abc");
		
		
		//Step 2: Create an Object of pojo class and initilize
		EmpDetailsWithObject empy = new EmpDetailsWithObject("Indira", "Tyss720", "QA", phno,sp);
		
		//step 3: create an object of Object mapper 
		ObjectMapper obj = new ObjectMapper();
		
		//step 4: from object mapper call a method of Writevalue
		 obj.writeValue(new File("./EmpyDetailwithObject.json"),empy);
		
	}

}
