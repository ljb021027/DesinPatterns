package Proxy.jdk;	


/**
 * 被代理类  可以实现多个接口 
 * @author ljb
 *
 */
public class Singer implements Person{	
	
	@Override	
	public void walk() {	
		System.out.println("I am walking");	
			
	}	
	
	@Override	
	public void sayhello(String string) {	
		System.out.println("I am singing " + string);	
	}	
	
}	
