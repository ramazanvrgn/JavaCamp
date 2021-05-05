package Concrete;

import java.net.MalformedURLException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws MalformedURLException, Error  {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else
		{
			throw new Error("Not a valid person.");
		}
		
		
	}

}
