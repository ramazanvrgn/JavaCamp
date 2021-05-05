package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

import java.net.MalformedURLException;
import java.util.Locale;
import java.net.URI;
import java.net.URL;

public class MernisServiceAdapter implements CustomerCheckService {

	 private final String endpoint = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws MalformedURLException {
		
		URL url = URI.create(endpoint).toURL();
        KPSPublic service = new KPSPublic(url);
        KPSPublicSoap port = service.getPort(KPSPublicSoap.class);
        return port.tcKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(Locale.ROOT),customer.getLastName().toUpperCase(Locale.ROOT),customer.getDateOfBirth().getYear());

		
	}

}
