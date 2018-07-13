package co.edureka.one;
//public
public class One {
	private void pvtShow(){
		System.out.println("This is a private show of One");
	
	}
	void defShow(){
		System.out.println("This is a default show of One");

	}
	protected void protShow(){
		System.out.println("This is a protected show of One");

	}
	public void pubShow(){
		System.out.println("This is a public show of One");

	}
}
//Default
class Two{
	private void pvtShow(){
		System.out.println("This is a private show of Two");
	
	}
	void defShow(){
		System.out.println("This is a default show of Two");

	}
	protected void protShow(){
		System.out.println("This is a protected show of Two");

	}
	public void pubShow(){
		System.out.println("This is a public show of Two");

	}
}
//private class Three{
	
	
//}

//Class cannot be protected
//protected calss Four{
//}

//Only one public class 
//public class Five{
//}
//Can have multiple default classes (in one source file)
class Six{
	
}