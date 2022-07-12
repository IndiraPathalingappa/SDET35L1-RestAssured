package pojoForSerialzationDeserialization;

public class EmplyopeeDetailsWithArray {
	
	
	//step 1: Declare all the necessary 
	String Empname;
	String Empid;
	String Emailid;
	int[] phno;
	String Designation;
	
	//step 2:create a constructor to initilize the variables
	public EmplyopeeDetailsWithArray(String empname, String empid, String emailid, int[] phno, String designation) {
		this.Empname = empname;
		this.Empid = empid;
		this.Emailid = emailid;
		this.phno = phno;
		this.Designation = designation;
	}
	
	// create an constructor 
	public EmplyopeeDetailsWithArray() {
		
	}

	// provide the getters and setters method to access the variables
	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public String getEmpid() {
		return Empid;
	}

	public void setEmpid(String empid) {
		Empid = empid;
	}

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	

	}
