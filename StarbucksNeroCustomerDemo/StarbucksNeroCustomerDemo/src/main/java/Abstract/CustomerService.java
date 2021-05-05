package Abstract;

import java.net.MalformedURLException;

import Entities.Customer;

public interface CustomerService {
	void Save(Customer customer) throws MalformedURLException, Error;
}
