package pojoForSerialzationDeserialization;

public class EmpDetailsWithObject {
	
	//step 1: declare all the variables as global
	String name;
	String empid;
	String Designation;
	int[] phno;
	Object Spouse;
	
	// create a constructor to initilize the variables
	public EmpDetailsWithObject(String name, String empid, String designation, int[] phno, Object spouse) {
		this.name = name;
		this.empid = empid;
		this.Designation = designation;
		this.phno = phno;
		this.Spouse = spouse;
	}
	
	// create empty constructor for deserialization
	public EmpDetailsWithObject(){
		
	}
	//Provide getters and setters method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	public Object getSpouse() {
		return Spouse;
	}

	public void setSpouse(Object spouse) {
		Spouse = spouse;
	}
	
	
	

}
