package HrmsProje.HrmsProje.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import HrmsProje.HrmsProje.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {

   
}
