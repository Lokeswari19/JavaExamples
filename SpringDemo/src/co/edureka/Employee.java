package co.edureka;

public class Employee {
//Attributes
		Integer id;
		String name;
		Integer salary;
		String email;
		String address;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getSalary() {
			return salary;
		}
		public void setSalary(Integer salary) {
			this.salary = salary;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return ("Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", address="
					+ address + "] \n" + super.toString());
		}
		
		public void myInit(){
			System.out.println("Employee Initialized");
		}
		public void myDestroy(){
			System.out.println("Employee destroyed");
		}
		public Employee(){
			System.out.println("Employee Contructed");
		}
}
