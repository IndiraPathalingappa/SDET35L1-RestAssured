package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerialzationDeserialization.EmplyopeeDetailsWithArray;

public class DeserializationEmpwithArray {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		//step 1: create an object of object mappaer
		ObjectMapper obj = new ObjectMapper();
		
		//step 2:call the read value method and store it in a variable
		EmplyopeeDetailsWithArray e2 = obj.readValue(new File(".\\EmpDetailwithArray"), EmplyopeeDetailsWithArray.class);
		
		//step 3:using getters and setter method using variables
		System.out.println(e2.getDesignation());
		System.out.println(e2.getEmpid());
		System.out.println(e2.getPhno()[0]);
		
	}

}
