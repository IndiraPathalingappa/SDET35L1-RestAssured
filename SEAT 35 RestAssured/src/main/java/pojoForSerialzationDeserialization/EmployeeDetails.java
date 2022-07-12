package pojoForSerialzationDeserialization;
/**
 * This is pojo class for serialization and deserialization
 * @author indir
 *
 */
public class EmployeeDetails {
	
	//step 1:Declare all the necessary variables as global
	String Empname;
	String EmpId;
	String Empemail;
	int phno;
	String Designation;
	
	//Step 2: create a constructor to initilaze the variables
	public EmployeeDetails(String empname, String empId, String empemail, int phno, String designation) {
		this.Empname = empname;
		this.EmpId = empId;
		this.Empemail = empemail;
		this.phno = phno;
		this.Designation = designation;
		
	}
	
	//create empty constructor for deserialization
	public EmployeeDetails() {
		
	}
	
	//Step 3: provide a getters and setters method to access these variables

	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getEmpemail() {
		return Empemail;
	}

	public void setEmpemail(String empemail) {
		Empemail = empemail;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getDesegnation() {
		return Designation;
	}

	public void setDesegnation(String desegnation) {
		Designation = desegnation;
	}
	
	
}
