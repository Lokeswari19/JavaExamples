package co.edureka.exceptions;

public class ExcDemo {

	
	//All  Instructions in the main are executed step by step
	public static void main(String[] args) {
		System.out.println("Main Started..");
		
		int arr[] = {10,20,30,40,50};
		int a=10;
		int b=0;
		try{
				try{
					int c=a/b;
					System.out.println("c is ..."+ c);
				}catch(Exception e){
					e.printStackTrace(); // will print all the stack from where exception originated
				}
				
				System.out.println("arr[2] is .. "+ arr[2]);
		}catch(Exception e){
			System.out.println("Message for exception is .." + e);
		}finally{
			System.out.println("Must be executed");
		}
	}

}
