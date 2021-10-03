package HrmsProje.HrmsProje.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProje.HrmsProje.business.abstracts.JobAdvertService;
import HrmsProje.HrmsProje.core.utilities.results.DataResult;
import HrmsProje.HrmsProje.core.utilities.results.Result;
import HrmsProje.HrmsProje.core.utilities.results.SuccessDataResult;
import HrmsProje.HrmsProje.core.utilities.results.SuccessResult;
import HrmsProje.HrmsProje.dataAccess.abstracts.JobAdvertDao;
import HrmsProje.HrmsProje.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {

	private JobAdvertDao jobAdvertDao;

	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<List<JobAdvert>>
		(this.jobAdvertDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("İş ilanı eklendi");
	}

}
