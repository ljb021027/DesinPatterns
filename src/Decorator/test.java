package Decorator;	
	
public class test {	
	public static void main(String[] args) {	
		Animal a =new Person("ljb");	
		a.show();	
		Txu tx = new Txu(a);	
		tx.show();	
		
			
			
	}	
}	
