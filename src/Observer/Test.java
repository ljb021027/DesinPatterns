package Observer;

public class Test {
	public static void main(String[] args) {
		Observable ob = new Observable();
		ob.addOb(new ConcreteObserver1());
		ob.addOb(new ConcreteObserver1());
		ob.addOb(new ConcreteObserver2());
		ob.notice();
	}
}
