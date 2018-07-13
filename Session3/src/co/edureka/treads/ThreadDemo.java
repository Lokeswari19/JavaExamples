package co.edureka.treads;

import java.io.IOException;

class MyThread extends Thread{
	public void run(){
		for (int i=1; i<=10;i++){
			try{
				Thread.sleep(750); //making the thread to be blocked for 1 sec
				}catch(InterruptedException e){
					e.printStackTrace();
					
				}
			System.out.println("***MyThread** " + i);
		}
			
	}
}
class YourThread extends Thread{
	public void run(){
		for (int i=1; i<=10;i++){
			try{
				Thread.sleep(250); //making the thread to be blocked for 1 sec
				}catch(InterruptedException e){
					e.printStackTrace();
					
				}
			System.out.println("***YourThread** " + i);
		}
			
	}
}
class A{
	
}
class B extends A implements Runnable{
	public void run(){
		
	}
	
}
class OurThread implements Runnable{
	public void run(){
		for (int i=1; i<=10;i++){
			try{
				Thread.sleep(500); //making the thread to be blocked for 1 sec
				}catch(InterruptedException e){
					e.printStackTrace();
					
				}
			System.out.println("**Our Thread** " + i);
		}
			
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		
		MyThread mtRef =new MyThread();
		YourThread yrRef =new YourThread();
		
		Runnable r= new OurThread();//Polymorphic Statement
		Thread otRef=new Thread(r);
		//Setting priority is a request . it might be fulfilled it might not be
		mtRef.setPriority(Thread.MAX_PRIORITY);
		yrRef.setPriority(Thread.MIN_PRIORITY);
		otRef.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println("mtRef name is " + mtRef.getName());
		
		mtRef.start();
		//After mtRef start we are executing mtRef. join
		try{
			mtRef.join();//Command
		}catch(InterruptedException e1){
			e1.printStackTrace();
		}
		yrRef.start();
		otRef.start();
		otRef.yield(); // Request
		
		for (int i=1; i<=10;i++){
			try{
			Thread.sleep(1000); //making the thread to be blocked for 1 sec
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
			System.out.println("----Main Thread---" +i );
		}
		
		System.out.println("Main Thread Finished");

	}

}
