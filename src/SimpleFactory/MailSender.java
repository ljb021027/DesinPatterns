package SimpleFactory;	
/**	
 * 邮件发送实现类	
 * @author ljb	
 *	
 */	
public class MailSender implements Sender {	
	
	@Override	
	public void Send() {	
		System.out.println("this is MailSender!!!");	
	}	
		
}	
