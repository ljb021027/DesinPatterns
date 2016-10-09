package Decorator;	
	
public class Sneakers extends Finery{	
	public Sneakers(Animal component) {	
		super(component);	
	}	
	
	public void show(){	
		System.out.println("球鞋");	
		super.show();	
	}	
}	
