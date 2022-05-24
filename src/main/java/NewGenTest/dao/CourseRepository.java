package NewGenTest.dao;

import javax.transaction.Transactional;

import NewGenTest.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Transactional
public interface CourseRepository extends CrudRepository<Course, Long>{

	ArrayList<Course> findAll();
    ArrayList<Course> findAllByCountry(String country);
	ArrayList<Course> findAllByPriceBetween(Float price1, Float price2);
	ArrayList<Course> findAllByPriceAfter(Float price1);
	ArrayList<Course> findAllByPriceBefore(Float price2);
	ArrayList<Course> findAllByCountryAndPriceBetween(String country, Float price1, Float Price2);
	ArrayList<Course> findAllByCountryAndPriceAfter(String country, Float price1);
	ArrayList<Course> findAllByCountryAndPriceBefore(String country, Float price2);
	
}
