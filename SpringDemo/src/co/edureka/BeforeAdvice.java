package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("---- Before Advice execution started----");
		
		System.out.println("Method  Name:"+ arg0.getName());
		//Input to the method
		for (Object o:arg1){
			System.out.println(o);
		}
		//Refrence to the Object
		System.out.println("arg2 is :" +arg2);
		System.out.println(" -----BeforeAdvice Execution Finished-----");
	}

}
