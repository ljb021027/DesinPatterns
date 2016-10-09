package Proxy;	
	
public class Proxy implements Sourceable {	
	private Source source;	
	
	public Proxy() {	
		this.source = new Source();	
	}	
	
	@Override	
	public void method() {	
		after();	
		source.method();	
		before();	
	}	
	
	private void after() {	
		System.out.println("after.....");	
	}	
	
	private void before() {	
		System.out.println("before.....");	
	}	
	
}	
