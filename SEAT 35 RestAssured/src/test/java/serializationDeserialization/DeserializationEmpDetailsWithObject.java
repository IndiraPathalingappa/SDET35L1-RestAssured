package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialzationDeserialization.EmpDetailsWithObject;

public class DeserializationEmpDetailsWithObject {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		// step 1 :create an object of Object mapper
		ObjectMapper obj = new ObjectMapper();
		
		//step 2: call the read value method and store it in a variable
		EmpDetailsWithObject e3 = obj.readValue(new File(".\\EmpyDetailwithObject.json"), EmpDetailsWithObject.class);
		
		//step 3:using getters and setters method get the values
		System.out.println(e3.getSpouse());
		int[] e4 = e3.getPhno();
		for (int string : e4) {
			System.out.println(string);
			
		}
		
	}
}
