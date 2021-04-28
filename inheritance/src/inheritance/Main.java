package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer =new Customer();
		
		individualCustomer engin=new individualCustomer();
		
		engin.customerNumber="123";
		
		CorporateCustomer hepsiburada=new CorporateCustomer();
		
		hepsiburada.customerNumber="11234";
		
		SendikaCustomer sendikaCustomer=new SendikaCustomer();
		
		sendikaCustomer.customerNumber="112";
		
		CustomerManager customerManager=new CustomerManager();
		//customerManager.add(sendikaCustomer);
		
		
		Customer[] customers= {engin,sendikaCustomer,hepsiburada};
		
		
		customerManager.addMultiple(customers);
	}

}
