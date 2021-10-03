package HrmsProje.HrmsProje.business.abstracts;

import java.util.List;

import HrmsProje.HrmsProje.core.utilities.results.DataResult;
import HrmsProje.HrmsProje.core.utilities.results.Result;
import HrmsProje.HrmsProje.entities.concretes.JobAdvert;

public interface JobAdvertService {

	   DataResult<List<JobAdvert>> getAll();
	   Result add(JobAdvert jobAdvert);
	   

}