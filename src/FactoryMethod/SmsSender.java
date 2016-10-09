package FactoryMethod;	
/**	
 * 短信发送实现类	
 * @author ljb	
 *	
 */	
public class SmsSender implements Sender{	
	
	@Override	
	public void Send() {	
		System.out.println("this is SmsSender");	
	}	
	
}	
