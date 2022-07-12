package pojoForSerialzationDeserialization;

import java.io.Serializable;

public class Spouse implements Serializable{

	String Sname;
	int  Snumber;
	String Scompany;
	
	//create an constructor of Spouse
		public Spouse(String sname, int snumber, String scompany) {
		super();
		Sname = sname;
		Snumber = snumber;
		Scompany = scompany;
	}

		// provide getters and setters method to initilize
		public String getSname() {
			return Sname;
		}

		public void setSname(String sname) {
			Sname = sname;
		}

		public int getSnumber() {
			return Snumber;
		}

		public void setSnumber(int snumber) {
			Snumber = snumber;
		}

		public String getScompany() {
			return Scompany;
		}

		public void setScompany(String scompany) {
			Scompany = scompany;
		}

	
	
	}
	


