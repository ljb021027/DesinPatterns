package Proxy.jdk;	
	
public class Singer implements Person{	
	
	@Override	
	public void walk() {	
		System.out.println("I am walking");	
			
	}	
	
	@Override	
	public void sayhello(String string) {	
		System.out.println("I am singing");	
	}	
	
}	
