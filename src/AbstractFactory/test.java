package AbstractFactory;	
	
public class test {	
	public static void main(String[] args) {	
		User user = new User();	
		Dep dep = new Dep();	
//		IFactory factory = new SqlserverFactory();	
//		Iuser iu = factory.CreateUser();	
//		IDep id = factory.CreateDep();	
//		iu.Insert(user);	
//		iu.getUser(1);	
//		id.insertDep(dep);	
//		id.getDep(1);	
			
		Iuser iu2 = DataAccess.CreateUser();	
		iu2.Insert(user);	
		iu2.getUser(1);	
	}	
}	
