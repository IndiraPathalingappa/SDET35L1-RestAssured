package pojoForComplexData1;

public class PojoClassForComplexData {
	
	//declare all the necessary variables as global
	String createdBy;
	String projectName;
	String status;
	String teamSize;
	
	//Create the constructor to initilize the variables
	public PojoClassForComplexData(String createdBy, String projectName, String status, String teamSize) {
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}

	//Provide the getters and setters method to utilize 
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}
	
	
	
	

}
