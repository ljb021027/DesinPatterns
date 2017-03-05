package Proxy;	


/**
 * 被代理类
 * @author ljb
 *
 */
public class Source implements Sourceable{	
	
	@Override	
	public void method() {	
		System.out.println("this is Source");	
	}	
	
}	
