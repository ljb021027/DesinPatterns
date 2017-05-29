package Observer;

/**
 * 具体观察者1
 * @author ljb
 *
 */
public class ConcreteObserver1 implements Observer{

	@Override
	public void update(Observable o) {
		System.out.println("观察者1");
	}

}
