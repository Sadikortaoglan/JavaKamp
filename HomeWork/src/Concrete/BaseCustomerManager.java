package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Kay�t edildi : "+customer.getFirstName());
		
	}

}
