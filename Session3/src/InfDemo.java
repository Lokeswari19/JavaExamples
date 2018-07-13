interface InfOne{
	void show();
}
interface InfTwo{
	void fun();
	void show();
}
//Not supporting Object to Object inheritance
//Interface to Interface like we have Class to lass
interface InfThree extends InfOne, InfTwo{ //Extends is allowed. and happends on multiple fashion
	
	
}
//extension focus on Parent Child relation
//Implementation focus on kind of Implementation relationship eg. Traffic polic rules, college rules
class One implements InfThree{ // Not Multiple Inheritance ..It is Multiple Implementation.
	public void show(){
		System.out.println("This is show");
	}
	public void fun(){
		System.out.println("This is fun");
	}
	void hello(){
		System.out.println("This is hello");
	}
}
public class InfDemo {

	public static void main(String[] args) {
		
		InfThree i3 = new One();
		i3.show();
		i3.fun();
		//In Order to access Hello to create an extra Object
		//One o= new One();
		One o= (One)i3; //Downcasting
		o.hello();
		
	}

}
