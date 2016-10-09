package Proxy.jdk;	
	
import java.lang.reflect.InvocationHandler;	
import java.lang.reflect.Proxy;	
	
	
public class ProxyTest {	
	public static void main(String[] args) {	
		//创建一个InvocationHandler对象	
		InvocationHandler handler = new MyInvocationHandler();	
		//使用指定的InvocationHandler来生成动态代理对象	
		Person p =(Person) Proxy.newProxyInstance(Person.class.getClassLoader(), 	
				new Class[]{Person.class}, 	
				handler);	
		//不管调用代理对象的任何方法 都会替换成invoke()	
		p.walk();	
		p.sayhello("11");	
			
	}	
	
}	
