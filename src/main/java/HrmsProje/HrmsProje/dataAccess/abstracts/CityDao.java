package HrmsProje.HrmsProje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProje.HrmsProje.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

}
