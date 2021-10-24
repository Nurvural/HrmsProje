package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Cv;
import service.CvService;
@RestController
@RequestMapping("/api/cvs")
public class CvController {
	@Autowired
	CvService cvsService;
	
	@GetMapping("/getall")
	private List<Cv> getAll(){
		return this.cvsService.getAllCvs();
	}
	
	@GetMapping("/getcvbyid/{cvid}")
	private Cv getCvs(@PathVariable("cvid") int cvid) {
		return cvsService.getCvsByid(cvid);
	}
	@PostMapping("/add")
	private int saveCv(@RequestBody Cv cv) {
		 cvsService.saveCv(cv);
		 return this. cvsService.getcvid()	;
	}
	@PutMapping("/update")
	private Cv updateCv(@RequestBody Cv cv) {
		cvsService.saveCv(cv);
		return cv;
	}

}
