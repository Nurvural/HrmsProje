package HrmsProje.HrmsProje.business.abstracts;

import java.util.List;

import HrmsProje.HrmsProje.core.utilities.results.DataResult;
import HrmsProje.HrmsProje.core.utilities.results.Result;
import HrmsProje.HrmsProje.entities.concretes.Employer;


public interface EmployerService {

	 DataResult<List<Employer>> getAll();
	  Result add(Employer employer);
}
