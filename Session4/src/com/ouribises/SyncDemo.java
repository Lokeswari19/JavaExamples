package com.ouribises;
class Table{
	//Lock Acquiaition  happens (lock or monitor or mutex)
	//synchronized void printTable(int num){ ///Synchronized method
	void printTable(int num){ ///AsSynchronized method
		synchronized(this){   //Synchronized block
			for (int i=1;i<=10;i++){
				try{
					Thread.sleep(200);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(num +" " + i +"'s are " + (num*i));
			}
		}
		
	}
	//n number of methods in your class for synchronization you need to make methods synchronized
	void func(){
		System.out.println("This is a fun");
	}
	//Ensures Atomicity. l is a 64 bit container
	//OS is 32 bits, so write operation in l will happen in 2 shot
	volatile long l=100; // When a write operation happens  on l , no one else can read or write
	
}

class MyThread extends Thread{
	Table t;
	MyThread(Table u){
		t=u;	}
	public void run(){
		
		synchronized (t) { //synchronized block Acquire lock over the object to which t points
			t.printTable(5);
			t.func();
		}
	}
}

class YourThread extends Thread{
	Table t;
	YourThread(Table u){
		t=u;	}
	public void run(){
		synchronized (t) { //synchronized block Acquire lock over the object to which t points
			t.printTable(7);
			t.func();
		}
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		Table t=new Table();
		//t.printTable(5);
		//For Table we have only one object which is reffered by t
		//Two threads are working on the same object
		MyThread mtRef=new MyThread(t);
		YourThread yrRef =new YourThread(t);
		
		//Since threads run parellely we are getting time slicing in action.
		mtRef.start();
		yrRef.start();
	}
	
	
	
	
}
