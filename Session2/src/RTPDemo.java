class Shape{
	void draw(){
		System.out.println("Drawing a Shape");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("Drawing a Circle");
	}
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("Drawing a rectangle");
	}
}
class Polygon extends Shape{
	void draw(){
		System.out.println("Drawing a Polygon");
	}
}
public class RTPDemo {

	public static void main(String[] args) {
		Shape s;
		s= new Circle();	// Polymorphic Statement |Reference of parent can point to the object of child
		s.draw();			// ideally draw of parent should be called, but here we will see overriding in action
		
		s= new Rectangle();
		s.draw();
		
		s=new Polygon();
		s.draw();
		
	}

}
