package Abstract;

import java.net.MalformedURLException;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) throws MalformedURLException, Error {
		
		System.out.println("Save to Database : "+customer.getFirstName());
	}

}
