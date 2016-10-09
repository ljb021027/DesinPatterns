package Decorator;	
/**	
 * 具体装饰器	
 * 	
 * @author ljb	
 *	
 */	
public class Txu extends Finery{	
		
	public Txu(Animal animal){	
		super(animal);	
	}	
		
	public void show(){	
		System.out.println("大T恤");	
		super.show();	
	}	
}	
