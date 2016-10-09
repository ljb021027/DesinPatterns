package AbstractFactory;	
	
public class SqlserverFactory implements IFactory{	
	
	@Override	
	public Iuser CreateUser() {	
		return new SqlserverUser();	
	}	
	
	@Override	
	public IDep CreateDep() {	
		return new SqlserverDep();	
	}	
	
}	
