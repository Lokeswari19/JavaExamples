package co.edureka;

public class Child extends Father {
	String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Child [phone=" + phone + "] \n From the Parent" + super.toString();
	}
	
}
