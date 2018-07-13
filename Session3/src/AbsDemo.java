//Redefined Versio of Shape to do RunTime Polymorphism

/*abstract class Shape{ //for which you cannot create objects.. 
	Shape(){
		System.out.println("--Shape Constructor---");
	}
	abstract void draw();//method which has no definition. it acts like a rule which children must define 
	//It is only available in abstract class
	//abstract method cannot be static or private
	void fun(){
		System.out.println("This is fun");
	}
}*/
//Most refined way to perform runtime polymorphism
interface Shape{ // s is a seperate concept for which we cannot create objects even JVM cannot
	//interface cannot create the constructor , Neither Runtime or i can create 
	void draw(); //by default marked as public abstract void draw
	
}
class Circle implements Shape{
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}
class Rectangle implements Shape{
	public void draw(){
		System.out.println("Drawing a rectangle");
	}
}
class Polygon implements Shape{
	public void draw(){
		System.out.println("Drawing a Polygon");
	}
}

public class AbsDemo {

	public static void main(String[] args) {
		//Run Time Polymorphism
		Shape s;
		s=new Circle();
		s.draw();
		
		s=new Rectangle();
		s.draw();
		
		s=new Polygon();
		s.draw();
		
		
		//Having an Object of shape class and having draw definition is not of use
		//no objects can be created 
		//s=new Shape();
		//s.draw();
		
	}

}

//Inheritance happens in 2 levels
//Object to Object |non Static
//Class to Class   |static
//For abstract class ysou can not create object but runtime env create the object to do the inheritance