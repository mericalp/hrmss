package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.WorkHours;

public interface CityDao extends JpaRepository<City,Integer> {

	//City getById(int id);
	City findById(int id);

}

