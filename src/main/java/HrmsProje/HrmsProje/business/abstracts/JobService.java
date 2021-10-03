package HrmsProje.HrmsProje.business.abstracts;

import java.util.List;

import HrmsProje.HrmsProje.core.utilities.results.DataResult;
import HrmsProje.HrmsProje.core.utilities.results.Result;
import HrmsProje.HrmsProje.entities.concretes.Job;

public interface JobService {

  DataResult<List<Job>> getAll();
  Result add(Job job);
}
