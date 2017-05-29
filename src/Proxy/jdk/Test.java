package Proxy.jdk;	
	
import java.lang.reflect.Proxy;	

/**
 * 动态代理测试类
 * @author ljb
 *
 */
public class Test {	
	public static void main(String[] args) {	
		Singer target = new Singer();	
		MyInvocationHandler handler = new MyInvocationHandler();	
		handler.setTarget(target);	
		/**
		 * - ClassLoader loader // 被代理类的类加载器，用来创建代理类 
			- Class<？>[] interfaces //被代理类实现的接口，创建的代理类会实现这些接口 
			- InvocationHandler invocationHandler //最关键的接口
			！它只有一个 invoke 方法，是代理类进行 拦截操作 的入口，
			一般需要自定义一个 Handler 来实现方法增强。
		 */
		Person p =(Person) Proxy.newProxyInstance(
				Person.class.getClassLoader(), 	
				new Class[]{Person.class}, 	
				handler);	
		p.walk();	
		p.sayhello("hello----");	
			
	}	
}	
