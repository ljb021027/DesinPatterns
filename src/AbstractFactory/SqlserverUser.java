package AbstractFactory;	
	
public class SqlserverUser implements Iuser{	
	
	@Override	
	public void Insert(User user) {	
		System.out.println("Sqlserver增加一个用户");	
	}	
	
	@Override	
	public User getUser(int id) {	
		System.out.println("Sqlserver查询一个用户");	
		return null;	
	}	
	
}	
