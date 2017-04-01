package Observer;
/**
 * 具体观察者2
 * @author ljb
 *
 */
public class ConcreteObserver2 implements Observer{

	@Override
	public void update(Observable o) {
		System.out.println("观察者2");
		
	}

}
