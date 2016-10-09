package AbstractFactory;	
	
public class AccessFactory implements IFactory{	
	
	@Override	
	public Iuser CreateUser() {	
		return new AccessUser();	
	}	
	
	@Override	
	public IDep CreateDep() {	
		return new AccessDep();	
	}	
	
}	
