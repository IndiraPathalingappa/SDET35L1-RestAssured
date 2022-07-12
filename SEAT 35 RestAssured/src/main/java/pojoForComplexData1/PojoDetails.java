package pojoForComplexData1;

public class PojoDetails {
	
	//declare all the necessary variables as global
	int id;
	String category;
	
	//create a constructor to initilise variable
	public PojoDetails(int id, String category) {
		this.id = id;
		this.category = category;
	}

	//provide getters and setters method for utilization
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
