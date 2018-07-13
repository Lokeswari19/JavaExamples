package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("---- After Advice execution started----");
		
		System.out.println("Method  Name:"+ arg1.getName());
		//Input to the method
		for (Object o:arg2){
			System.out.println(o);
		}
		//Refrence to the Object
		System.out.println("arg0 is :" +arg0);
		System.out.println("arg3 is :" +arg3);
		System.out.println(" -----AfterAdvice Execution Finished-----");
		
	}

}
