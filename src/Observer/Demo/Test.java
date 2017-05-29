package Observer.Demo;

public class Test {
	public static void main(String[] args) {
		Reader r1 = new Reader("小a");
		Reader r2 = new Reader("小b");
		Reader r3 = new Reader("小c");
		
		Writer w1 = new Writer("作家1");
		Writer w2 = new Writer("作家2");
		
		r1.subscribe("作家1");
		r2.subscribe("作家1");
		
		w1.notice("java编程思想");
		
		r1.unsubscribe("作家1");
		w1.notice("大话设计模式");
		
		
		
		
	}
}
