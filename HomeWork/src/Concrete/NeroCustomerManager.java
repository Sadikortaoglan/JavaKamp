package Concrete;
import Entities.*;
import Abstract.CustomerCheckService;

public class NeroCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	public NeroCustomerManager(CustomerCheckService customerCheckService)
	{
		this.customerCheckService=customerCheckService;
		
	}
	public void Save(Customer customer)
	{
		if (customerCheckService.CheckIfRealPerson(customer))
		{
			super.Save(customer);
		}
	}
}
