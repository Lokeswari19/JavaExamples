class Counter{
	//Attribute
	//Non Static is the property of Object
	int count;
	//Static is the property of Class
	static int scount;
	Counter(){
		count=1;
		scount=1;
	}
	
	//Methods
	void incrementCount(){
		count++;
		scount++;
	}
	void showCount(){ // Non static is property of Object
		System.out.println("Count is  :" + count);
		System.out.println("sCount is  :" + scount);

	}
	//Property of class can be accessed by the property of object
	//property of object cannot be accesssed by the property of class
	static void fun(){ //Static method is property of class
		scount++;
		//count++; //is an error  -property of object cannot be accessed
	}
}
public class OOPSDemo {

	public static void main(String[] args) {
		Counter c1= new Counter();
		Counter c2= new Counter();
		c1.incrementCount();
		c2.incrementCount();
		c1.incrementCount();
		
		c2.incrementCount();
		c1.incrementCount();
		
		c1.incrementCount();
		//References to the object can access the property of class
		c1.scount=100;  		
		c2.scount=300;
		
		
		Counter.scount=500; //property of class can be accessed by class directly
		Counter.fun();// Property of class can be accessed by class directly	
		
		//Counter.count =10; //is an error
		
		c1.showCount();
		c2.showCount();
	}

}
