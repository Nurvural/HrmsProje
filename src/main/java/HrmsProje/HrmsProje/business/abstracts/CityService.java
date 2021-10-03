package HrmsProje.HrmsProje.business.abstracts;

import java.util.List;

import HrmsProje.HrmsProje.core.utilities.results.DataResult;
import HrmsProje.HrmsProje.core.utilities.results.Result;
import HrmsProje.HrmsProje.entities.concretes.City;


public interface CityService {

	  DataResult<List<City>> getAll();
	  Result add(City city);
	  
}
