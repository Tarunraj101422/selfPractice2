package singletonClass;

public class singletonDemo {
	private static final singletonDemo instance = new singletonDemo();
	// private static final variable.
	
	private singletonDemo() {
		// private default constructor. it will not allows object creation outside of the class.
	}
	
	public static singletonDemo getInstance() {
		// static method, loads at the time of class loading.
		return instance;
	}

}
