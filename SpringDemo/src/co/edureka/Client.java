package co.edureka;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
import org.springframework.core.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(101);
		e.setName("John");
		e.setSalary(30000);
		e.setEmail("john@example.com");
		e.setAddress("Redwood Shores");
			
		//System.out.println(e);		
		
		//Sprint Way,IoC
		
		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		Employee e1=(Employee)factory.getBean("emp1");
		System.out.println("IOC way...:\n"+e1);
		
		//ApplicationContext as a Spring Container
		//Is one more container Bean factory is an interface and AC is the implementation of Beanfactory.
		//This is better compare to Bean factory
		
		ApplicationContext context=new ClassPathXmlApplicationContext("employeebean.xml");
		
		Employee e2= context.getBean("emp1",Employee.class);
		System.out.println("ApplicationContext...:\n"+e2);
		
		Employee e3= context.getBean("emp1",Employee.class);
		System.out.println("ApplicationContext...:\n"+e3);
		System.out.println("----Bean Inheritance-------");
		Father father=context.getBean("father",Father.class);
		System.out.println(father);
		
		Child child =context.getBean("child", Child.class);
		System.out.println(child);
		System.out.println("----Dependency Injection -------");

		Person person=context.getBean("person",Person.class);
		System.out.println(person);
		System.out.println("Certificates :"+ person.certificates);
		System.out.println("----Auto Wiring-------");

		CB cb = context.getBean("cb", CB.class);
		cb.getCa().hello();
		
		MyMaths mRef=context.getBean("mathsproxy", MyMaths.class);
		mRef.squareOfNum(7);
		//closing the context or Spring container
		((ClassPathXmlApplicationContext)context).close();
		//Spring container once creates an object shall mark it as singleton. It means only one object. (By default)
		//Spring container creates the objects mentioned in XML file even if you are not requesting getBean method.
			}

}