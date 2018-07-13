package co.edureka.utilapis;
//Vector is same as Arraylist. The only difference is that , Vector is synchronized but Arraylist is not. THat means Vector is ThreadSafe.
import java.util.Vector;

import java.util.PriorityQueue;

public class VectorDemo {
	public static void main(String[] args){
		//Declaring a vector
		//Constructor-> Vector(int siez,int incr)
		//Syncrhonized
		//The increament specifies the number of eleent to allocate each time that a vector is resized upward
	
		Vector<Integer> v=new Vector<Integer>(3,2);
		v.add(20);
		v.add(10);
		System.out.println("--------Vector-------------");
		System.out.println(v.size());
		System.out.println("--------Priority Queue-------------");

		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			pq.add(new Integer(i));
			
		}
		for(int i=1; i<=10;i++){
			Integer c=pq.poll();
			System.out.println(c);
		}
		
	}
}
