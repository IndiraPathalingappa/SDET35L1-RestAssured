package ProjectLibrary;

public class ProjectLibrary {
	
	//step 1: declare all the variables as global
	String createdBy;
	String projectName;
	String status;
	int teamsize;
	
	//create a constructor to initilize  the variables
	public ProjectLibrary(String createdBy, String projectName, String status, int teamsize) {
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamsize = teamsize;
	}
	
	//Provide getters and setters method

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectname(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	
}
