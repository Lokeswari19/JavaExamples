package co.edureka;
import java.util.*;
public class Person {
	String name;
	String phone;
	Address adrs;
	List<String> certificates;
	public Person(){}
	
	public Person(Address adrs) {
		super();
		this.adrs = adrs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	
	
	public List<String> getCertificatess() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", adrs=" + adrs + "]";
	}
	
	
	
}
