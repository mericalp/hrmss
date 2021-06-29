package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.Work;

public interface CityService {
	
	DataResult<List<City>> getAll();
	DataResult<City> getById(int id);

}
