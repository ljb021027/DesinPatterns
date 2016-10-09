package SimpleFactory;	
/**	
 * 发送工厂	
 * @author ljb	
 *	
 */	
public class SendFactory {	
	//可修改方法为静态方法 ，调用就不用实例化工厂	
	public Sender MailProduce(){	
		return new MailSender();	
	}	
		
	public Sender SmsProduce(){	
		return new SmsSender();	
	}	
}	
