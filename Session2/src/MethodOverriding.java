class Parent{
	public void purchaseBike(){
		System.out.println("Lets purchase Pulsar");
	}
	static void purchaseCar(){
		System.out.println("Lets purchase Maruti");
	}
}
class Child extends Parent{
	public void purchaseBike(){ //Redefine non static | Overriding.. If the access modifiers of the child is more or same
		super.purchaseBike(); //super is sa ref variable which points to the object of parent constructed by Runtime Envvironemnt
		System.out.println("Lets purchase Enfield");
	}
	static void purchaseCar(){ // Redefine static | Hiding .. if the access modifiers of the child is more or same
		//super.purchaseCar(); //is error;
		Parent.purchaseCar();
		System.out.println("Lets purchase Honda");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Child ch=new Child();
		ch.purchaseBike(); //Execute the definition if child and we call it as overriding
		
		Child.purchaseCar();
	}

}
//Child Object has on method name - purchaseBike, which is from parent
//Child object has one nore method - purchaseBike which is from child