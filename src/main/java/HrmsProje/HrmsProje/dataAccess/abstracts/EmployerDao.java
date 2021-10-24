package HrmsProje.HrmsProje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProje.HrmsProje.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
