package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialzationDeserialization.EmployeeDetails;

public class DeserializationEmpDetails {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
	
		//step 1:create an object of objectMapper
		ObjectMapper obj = new ObjectMapper();
		
		//step 2: call the read value method and store it in a variable
		EmployeeDetails e1 = obj.readValue(new File(".\\EmployeeDetails.json"), EmployeeDetails.class);
		
		//step 3: using getters and setters access the variables
		System.out.println(e1.getDesegnation());
		System.out.println(e1.getEmpId());
		
		
	}
	
	

}
