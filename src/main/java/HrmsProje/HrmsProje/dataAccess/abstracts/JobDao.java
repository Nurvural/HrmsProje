package HrmsProje.HrmsProje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProje.HrmsProje.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer>{

}
