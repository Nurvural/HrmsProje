package HrmsProje.HrmsProje.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProje.HrmsProje.business.abstracts.CityService;
import HrmsProje.HrmsProje.core.utilities.results.DataResult;
import HrmsProje.HrmsProje.core.utilities.results.Result;
import HrmsProje.HrmsProje.entities.concretes.City;

@RestController
@RequestMapping("/api/citys")
public class CitysController {

    private CityService cityService;
	
	@Autowired
	public CitysController(CityService cityService) {
		super();
		this.cityService = cityService;
		
	}
	
	   @GetMapping("/getall")
	   public DataResult<List<City>> getAll(){
			return this.cityService.getAll();
		}
	   @PostMapping("/add")
	   public Result add(@RequestBody City city){
		   return this.cityService.add(city);
		}
}
