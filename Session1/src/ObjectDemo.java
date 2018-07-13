class User{//This represents the structure of an Object.. This is a drawing of an object
	// Attributes
	String name;
	private String phone;  //Data Hiding
	private String email;	//Data Hiding
	byte age;
	char gender;
	String address;
	//Special method | Constructor
	User()
	{
		
	}
	User(String nm, String ph , String em, byte a, char g, String ad){
		name 	= nm;
		phone 	= ph;
		email 	= em;
		age 	= a;
		gender 	= g;
		address = ad;
	}
	//Methods | Behaviour
	String getPhone() { // is a non private
		return phone;
	}
	void setPhone(String ph) { // is a non private
		phone = ph;
	}
	String getEmail() {  // is a non private
		return email;
	}
	void setEmail(String em) { //is a non private
		email = em;
	}
	void printUser(String str)
	{
		System.out.println(str +":"  + name + " - " + age + " - " + gender + " - " + email );
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		//Create a real Object.
		//Object Construction happens in the Memory (RAM)
		User user1 =new User(); //new operator Constructs the object at run time (in the heap) and returns back
		System.out.println("user1 is "+user1); //user1 is a reference variable 
		
		

		//write the date in Object
		user1.name		= "John";
		user1.setPhone("+1 999 999 9999");
		user1.setEmail("john.xx@example.com");
		user1.age		= 20;
		user1.address	="Redwood Shores";
		user1.gender	='M';
			
		user1.printUser("User1 is ");
		User user2 =new User("Jennie", "+1 988 999 9999","Jennie.xx@example.com",(byte)30,'F',"Southern Shores");

		
		//Read the data from the Object
		user2.printUser("User2 is ");
		
		User user3 = user1; //Reference copy
		System.out.println("user3 is  "+ user3);
		user3.printUser("User3 is ");
		
		user3.name = "John Watson";
		
		user3.printUser("User3 is ");
		user1.printUser("User1 is ");
		//State of an Object is Value of the Attributes
		
		User user4 =new User("Jack", "+1 988 888 9999","jack.xx@example.com",(byte)30,'F',"Southowood Shores");		
		System.out.println("user4 is  "+ user4);
		user4.printUser("User4 is ");
		
		
		
	}

}
