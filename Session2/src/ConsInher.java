class A{
		A(){
			System.out.println("This is in A");
		}
	
}
class B extends A{
		/*B(){
			System.out.println("This is in B");
		}*/
		B(int b) // parameterized
		{
			//super(); //Default super call shall be inerted by compiled itself for the parent default constructor
			System.out.println("This is in B and b is :" +b );

		}
}
class C extends B{
		C(){
			super(10); // super as a function call shall help to get the parameterized constructor executed
			System.out.println("This is in C");
		}
	
}
//Constructors are not inherited.. Before you construct the object of child Parent Object is Constructed
//Multiple inheritance is not supported in Java
// Inhereitance is used to reuse the common code present in class. 
public class ConsInher {

	public static void main(String[] args) {
		C cRef = new C();
	}

}
