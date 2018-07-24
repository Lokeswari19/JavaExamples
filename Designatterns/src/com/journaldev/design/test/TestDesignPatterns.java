package com.journaldev.design.test;
//For Abstract Pattern
import com.journaldev.design.abstractfactory.PCFactory;
import com.journaldev.design.abstractfactory.ServerFactory;

//For Factory Pattern
import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

//For Builder Pattern
import com.journaldev.design.builder.Computer1;

//For Prototype Pattern
import com.journaldev.design.prototype.Employees;

//For Adapter Pattern
import com.journaldev.design.adapter.SocketAdapter;
import com.journaldev.design.adapter.SocketClassAdapterImpl;
import com.journaldev.design.adapter.SocketObjectAdapterImpl;
import com.journaldev.design.adapter.Volt;

import java.util.List;

//For Composite Patterns
import com.journaldev.design.composite.Circle;
import com.journaldev.design.composite.Drawing;
import com.journaldev.design.composite.Shape;
import com.journaldev.design.composite.Triangle;

//For proxy Pattern
import com.journaldev.design.proxy.CommandExecutor;
import com.journaldev.design.proxy.CommandExecutorProxy;


public class TestDesignPatterns{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("*******Creational Pattern Methods*********");
		System.out.println("\n------Factory Pattern Output------------");
		testFactory();
		
		System.out.println("\n------Abstract Factory Pattern Output------------");
		testAbstractFactory();
		
		System.out.println("\n------Builder Pattern Output------------");
		testBuilderPattern();
		
		System.out.println("\n------Prototype Pattern Output------------");
		testPrototypePattern();
		
		System.out.println("\n*******Structural Pattern Methods*********");

		System.out.println("\n------Adapter Pattern Output------------");

		testClassAdapter();
		testObjectAdapter();
		
		System.out.println("\n------Composite Pattern Output------------");
		testCompositePattern();
		
		System.out.println("\n------Proxy Pattern Output------------");

		testProxyPattern();

	}
	private static void testProxyPattern() {
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	
	}
	private static void testPrototypePattern() throws CloneNotSupportedException  {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}
	private static void testCompositePattern() {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		
		drawing.draw("Red");
		
		drawing.clear();
		
		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
	}
	private static void testBuilderPattern() {
	//Using builder to get the object in a single line of code and 
    //without any inconsistent state or arguments management issues		
		Computer1 comp = new Computer1.ComputerBuilder(
		"500 GB", "2 GB").setBluetoothEnabled(true)
		.setGraphicsCardEnabled(true).build();
		System.out.println("BuilderFactory Computer Config::" + comp);
	}
	private static void testAbstractFactory() {
		Computer pc = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
	private static void testFactory(){
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
	
	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
		System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}
}