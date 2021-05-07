package eCommerce1.core.amazonEmail;

import eCommerce1.amazonEmail.AmazonMailManager;
import eCommerce1.core.EmailService;

public class AmazonMailManagerAdapter implements EmailService {
	
	
	private AmazonMailManager amazonMailManager;

	public AmazonMailManagerAdapter() {
		super();
		this.amazonMailManager = new AmazonMailManager();
	}

	@Override
	public void send(String email, String message) {
		amazonMailManager.send(email, message);
		
		
	}

}
