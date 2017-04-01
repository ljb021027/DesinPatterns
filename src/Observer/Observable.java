package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author ljb
 *
 */
public class Observable {
	List<Observer> Observers = new ArrayList<Observer>();
	
	public void addOb(Observer o){
		Observers.add(o);
	}
	
	public void delOb(Observer o){
		Observers.remove(o);
	}
	
	public void notice(){
		for(Observer o : Observers){
			o.update(this);
		}
	}
	
	
}
