package SimpleFactory;	
	
public class test {	
	public static void main(String[] args) {	
		SendFactory sendFactory = new SendFactory();	
		//只用改动这里来调用工厂的不同方法	
		Sender sender = sendFactory.MailProduce();	
		sender.Send();	
	}	
		
}	
