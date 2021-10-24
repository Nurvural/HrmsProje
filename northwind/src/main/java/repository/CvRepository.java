package repository;
import model.Cv;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.UpdateRepository;
@Repository
public interface CvRepository extends JpaRepository<Cv,Integer>{

	//Iterable<model.Cv> findAll();

	Object findByid(int cvid);

	//void save(model.Cv cv);

}
