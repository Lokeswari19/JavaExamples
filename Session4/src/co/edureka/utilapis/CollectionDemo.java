package co.edureka.utilapis;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Map;
import jaav
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;
*/
public class CollectionDemo {
	void arrayListDemo(){
		//Generic |Type Safety - can store only String
		ArrayList<String> list=new ArrayList<String>();
		//Row type | No type safety -> Can store any type of datea
		ArrayList list1=new ArrayList();
		//List support duplicate value
		list.add("John");
		list.add("Jennie");
		list.add("Jack");
		list.add("Jennie");
		
		list1.add("Harry");		
		list1.add(100);
		list1.add('A');		
		list1.add(new CollectionDemo());
		
		System.out.println("List is : " +list);
		System.out.println("List1 is : " +list1);
		
		System.out.println(list.get(0));
		
		//Read All 
		System.out.println("-------For Loop-------");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		list.remove(0);
		list.set(0, "Jennie Watson");
		if (list.contains("Jack")){
			System.out.println("Jack is in the list");
		}
		//int idx=list.lastIndexOf("Jack");
		
		System.out.println("-------Enhanced For Loop-------");
		for(String str:list){
			System.out.println(str);
		}
		System.out.println("------------------");

		for(Object o:list1){
			System.out.println(o);
		}
		
		System.out.println("-------Iterator-------");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			System.out.println(str);
		}
		
		System.out.println("------------------");

		Iterator<Object> itr1=list1.iterator();
		while(itr1.hasNext()){
			Object o1=itr1.next();
			System.out.println(o1);
		}
		System.out.println("-------ListIterator-------");
		ListIterator<String> listItr=list.listIterator();
		while(listItr.hasNext()){
			String str=listItr.next();
			System.out.println(str);
		}
		
		System.out.println("-------Enumeration-------");
		Enumeration<String> eList=Collections.enumeration(list);
		while(eList.hasMoreElements()){
			String str=eList.nextElement();
			System.out.println(str);
		}
		System.out.println("List is : " +list);
		
		
		System.out.println("--------Vector-------------");
		Vector<String> names=new Vector<String>();
		names.add("Fianna");
		names.add("Jim");
		names.add("Harry");
		for (String s:names){
			System.out.println(s);
		}
		
	}
	void QueueDemo(){
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>(); //Polymorphic statement
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		System.out.println("--------Priority Queue-------------");

		for (int i=1;i<10;i++){
			int element=queue.poll();
			System.out.println(element);
		}
	}
	void SetDemo(){
		//Here no duplicates are entertained |Uniqueness
		//Here data is not stored on indexes. Data is stored by using hasing.
		Set<String> set=new HashSet<String>();
		set =new TreeSet<String>();
		set.add("John");
		set.add("Jennie");
		set.add("Jack");
		set.add("John");
		set.add("Jie");
		set.add("Jack");
		set.add("Joe");
		
		System.out.println("Set is " +set); //Output is unordered i.e. because of Hasing Techique
		Iterator<String> itr =  set.iterator();
		System.out.println("-----Set Demo------------");
		while (itr.hasNext()){
				String name =itr.next();
				System.out.println(name);
		}
		if (set.contains("Jack")){
			System.out.println("Jack is in the set. Lets remove");		
			set.remove("Jack");
		}
		
		System.out.println("Now the Set is " +set); 

	}
	void MapDemo(){
		Map<Integer, String> map=new HashMap<>();
		map=new Hashtable<>();
		map.put(101, "John");
		map.put(201,"Jennie");
		map.put(301,"Jack");
		map.put(401,"Jim");
		map.put(501,"Joe");
		map.put(101, "John Watson"); // update for the existing key
		//map.put(null, "Some Name");// no null value for Hashtable
		//map.put(601, null);	//no null value for Hashtable
		System.out.println("Map is " +map);
		System.out.println("Size of Map is"+ map.size());
		System.out.println("Employee at 101 is :"+map.get(101));
		
		if (map.containsKey(101)){
			System.out.println("101 exists");
		}
		if (map.containsValue("Jack")){
			System.out.println("John exists");
		}
		//Reading the map
		Set<Integer> keys=map.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()){
			Integer key=itr.next();
			String value =map.get(key);
			System.out.println(key + " -" + value);
		}
		
		//Using EntrySet
		//EntrySet is a key value pair | 101 - John
		//Map is a  Collection of EntrySet
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer,String>> eItr=entrySet.iterator();
		while (eItr.hasNext()){
			Entry<Integer,String > entry=eItr.next();
			System.out.println(entry.getKey() + "-" +entry.getValue());
 		}
		
		HashMap<Integer, Employee> hMap=new HashMap<>();
		Employee e1=new Employee("John", 300000, "John@example.com");
		hMap.put(101, e1);
		
		System.out.println("Employee Hashmap:" + hMap);
	}
	public static void main(String[] args) {
		CollectionDemo cd=new CollectionDemo();
		cd.arrayListDemo();
		cd.QueueDemo();
		cd.SetDemo();
		cd.MapDemo();
		
		Outer oRef=new Outer();
		
		Outer.Inner iRef=oRef.new Inner();
		
	}

}

class Employee{
		String name;
		int salary;
		String email;
		Employee(){}
		Employee(String n, int s, String e){
			name =n;
			salary=s;
			email=e;
		
		}
}

class Outer{
	
	class Inner{
		
	}
}