package co.edureka;

public class Father {
	//Attributes
	String fname;
	String lname;
	String address;
	
	//Setters and getters

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Father [fname=" + fname + ", lname=" + lname + ", address=" + address + "]";
	}
	
	
	
}
