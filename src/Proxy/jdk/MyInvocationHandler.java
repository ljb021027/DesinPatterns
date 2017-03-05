package Proxy.jdk;	
	
import java.lang.reflect.InvocationHandler;	
import java.lang.reflect.Method;	
/**	
 * InvocationHandler实现类	
 * @author ljb	
 *	
 */	
public class MyInvocationHandler implements InvocationHandler{	
	MyInvocationHandler(){
		
	}
	//可以通过构造方法传入被代理对象  也可以通过set方法传入
	MyInvocationHandler(Object target){
		this.target = target;
	}
	
	public Object target;	
	public void setTarget(Object target){	
		this.target=target;	
	}	
	/*	
	 * 执行动态代理对象的所有方法时，都会被替换成执行如下的 invoke方法	
	 * 其中:	
	 * proxy-代表动态代理对象	
	 * method-代表正在执行的方法	
	 * args-代表执行代理对象方法时传入的实参	
	 */	
	@Override	
	public Object invoke(Object proxy, Method method, Object[] args)	
			throws Throwable {	
		PersonUtil pu = new PersonUtil();	
		pu.method1();	
		//关键	
		Object result = method.invoke(target, args);	
		pu.method2();	
		return result;	
			
//		System.out.println("正在执行"+method);	
//		if(args!=null){	
//			System.out.println("下面是执行该方法时传入的实参");	
//			for(Object o:args){	
//				System.out.println(o);	
//			}	
//		}else{	
//			System.out.println("没有传入实参");	
//		}	
//			
//		return null;	
	}	
	
}	
