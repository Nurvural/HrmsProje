package HrmsProje.HrmsProje.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import HrmsProje.HrmsProje.business.abstracts.JobService;
import HrmsProje.HrmsProje.core.utilities.results.DataResult;
import HrmsProje.HrmsProje.core.utilities.results.Result;
import HrmsProje.HrmsProje.entities.concretes.Job;


@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	private JobService jobService;
	
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
		
	}
	
	   @GetMapping("/getall")
	   public DataResult<List<Job>> getAll(){
			return this.jobService.getAll();
		}
	   @PostMapping("/add")
	   public Result add(@RequestBody Job job){
		   return this.jobService.add(job);
		}
}
