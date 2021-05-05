import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.net.MalformedURLException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws MalformedURLException, Error {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Aslan");
		customer.setLastName("kahraman");
		customer.setDateOfBirth(LocalDate.of(1996,1,1));
		customer.setNationalityId("12");
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer);

	}

}
