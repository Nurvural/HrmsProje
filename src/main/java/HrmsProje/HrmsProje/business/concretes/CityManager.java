package HrmsProje.HrmsProje.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProje.HrmsProje.business.abstracts.CityService;
import HrmsProje.HrmsProje.core.utilities.results.DataResult;
import HrmsProje.HrmsProje.core.utilities.results.Result;
import HrmsProje.HrmsProje.core.utilities.results.SuccessDataResult;
import HrmsProje.HrmsProje.core.utilities.results.SuccessResult;
import HrmsProje.HrmsProje.dataAccess.abstracts.CityDao;
import HrmsProje.HrmsProje.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>
		(this.cityDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("Şehir eklendi");
	}

}
