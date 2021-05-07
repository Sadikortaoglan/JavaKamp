package eCommerce1.core.googleEmail;

import eCommerce1.core.EmailService;
import eCommerce1.googleMail.GoogleMailManager;

public class GoogleMailManagerAdapter  implements EmailService{

	private GoogleMailManager googleMailManager;
	
	public GoogleMailManagerAdapter() {
		super();
		this.googleMailManager = new GoogleMailManager();
	}
	@Override
	public void send(String email, String message) {
		googleMailManager.send(email, message);
		
	}

}
