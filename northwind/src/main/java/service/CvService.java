package service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Cv;
import repository.CvRepository;

//import com.javacamp.crudexample.model.Book;
//import com.javacamp.crudexample.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class CvService {
	@Autowired
	CvRepository cvRepository;
	public List<Cv> getAllCvs(){
		List<Cv> cvs=new ArrayList<Cv>();
		cvRepository.findAll().forEach(cvs1->cvs.add(cvs1));
		return cvs;
	}
	public Cv getCvsByid(int cvid) {
		return  cvRepository.findByid(cvid).get();
	}
	
	public void updateBook(Cv cv , int cvid) {
		cvRepository.save(cv);
	}
	public void saveCv(Cv cv) {
		// TODO Auto-generated method stub
		
	}
	public void getCv(Cv cv) {
		// TODO Auto-generated method stub
		
	}
	

}
