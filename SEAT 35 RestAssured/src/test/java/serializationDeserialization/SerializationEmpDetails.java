package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialzationDeserialization.EmployeeDetails;

public class SerializationEmpDetails {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		// step 1:create an object of pojo class and initilize
		EmployeeDetails emp = new EmployeeDetails("Indira", "Tyss720", "Indira@ty.com", 98456, "Sr TE");

		//step 2: create object of object mapper class
		ObjectMapper obj = new ObjectMapper();

		//step 3: form object mapper call the methodwrite value()
		obj.writeValue(new File("./EmployeeDetails.json"), emp);


	}

}
