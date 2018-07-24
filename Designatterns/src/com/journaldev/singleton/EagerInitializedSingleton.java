package com.journaldev.singleton;
//In eager initialization, the instance of Singleton Class is created at the time of class loading
public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	//private Constructor to avoid client applications to use constructor
	
	private EagerInitializedSingleton(){}
	public static EagerInitializedSingleton getInstance(){
		return instance;
	}
}
