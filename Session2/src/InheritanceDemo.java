class Base{ //Parent or Super
	int x;		 //Base's Object's x	
	static int y;//Base's y
	
	//private things are not inherited.. Inheritance happens for non private concepts
	
	private int z;
	private static int p;
	
	void show(){
		z=10;
		x=x+z;	// private property is used only within the class	
		System.out.println("This is show...x=" + x);
	}
	
	static void statshow(){
		p=15;  // private static property is used only within the class	for static methods
		y=y+p;
		System.out.println("This is statshow.. y=" + y);
	}
}

class Derived extends Base{ //Child or Sub
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Derived dRef = new Derived();
		dRef.x=100;
		dRef.show();
		
		Derived.y=200;
		Derived.statshow();
	}

}
