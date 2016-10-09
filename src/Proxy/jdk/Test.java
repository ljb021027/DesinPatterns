package Proxy.jdk;	
	
import java.lang.reflect.InvocationHandler;	
import java.lang.reflect.Proxy;	
	
public class Test {	
	public static void main(String[] args) {	
		Singer target = new Singer();	
		MyInvocationHandler handler = new MyInvocationHandler();	
		handler.setTarget(target);	
		Person p =(Person) Proxy.newProxyInstance(Person.class.getClassLoader(), 	
				new Class[]{Person.class}, 	
				handler);	
		p.walk();	
		p.sayhello("hello----");	
			
	}	
}	
