package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialzationDeserialization.EmplyopeeDetailsWithArray;

public class SerializationEmpwithArray {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		// step1 :create an object of integer array
		int[] phno={9876,9876};
		
		//step 2: Create an object of pojo class and initilize
		EmplyopeeDetailsWithArray emp = new EmplyopeeDetailsWithArray("IndiraP", "Tyss720", "indu@ty.com",phno ,"QA");
		
		//step 3: create an object of object mapper class
		ObjectMapper obj = new ObjectMapper();
		
		//step 4: from object mapper call mapperwrite()
		
		obj.writeValue(new File("./EmpDetailwithArray.json"), emp);
	}

}
