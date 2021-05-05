package Abstract;

import java.net.MalformedURLException;

import Entities.Customer;

public interface CustomerCheckService {

	boolean CheckIfRealPerson(Customer customer) throws MalformedURLException;
}
