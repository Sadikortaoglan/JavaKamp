package Concrete;
import Abstract.CustomerCheckService;
import Entities.*;
public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer))
		{
			super.Save(customer);
		}
		
	}
}
