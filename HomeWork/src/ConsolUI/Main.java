package ConsolUI;

import java.time.LocalDate;

import Concrete.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroCustomerManager(new CustomerCheckManager());
		
		customerManager.Save(new Customer(1,"sadýk","ortaoglan",LocalDate.of(1996, 05, 17),"12546587"));
		

	}

}
