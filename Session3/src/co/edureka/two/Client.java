package co.edureka.two;
import co.edureka.one.*; // Imports all the Public class from the package
 //import co.edureka.One.two; //defaults are not imported
class Child extends One{
	void fun(){
		protShow();
		pubShow();
	}
}
public class Client {

	public static void main(String[] args) {
		One o=new One();
		
		//o.pvtShow();
		//o.defShow();
		//o.protShow(); //Inherited in child but behaves like private
		o.pubShow();
	}

}
