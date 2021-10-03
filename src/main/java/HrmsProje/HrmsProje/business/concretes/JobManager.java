package HrmsProje.HrmsProje.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProje.HrmsProje.business.abstracts.JobService;
import HrmsProje.HrmsProje.core.utilities.results.DataResult;
import HrmsProje.HrmsProje.core.utilities.results.Result;
import HrmsProje.HrmsProje.core.utilities.results.SuccessDataResult;
import HrmsProje.HrmsProje.core.utilities.results.SuccessResult;
import HrmsProje.HrmsProje.dataAccess.abstracts.JobDao;
import HrmsProje.HrmsProje.entities.concretes.Job;

@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>
		(this.jobDao.findAll(),"Data Listelendi");
	}
	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("İş pozisyonu eklendi");
	}

}
