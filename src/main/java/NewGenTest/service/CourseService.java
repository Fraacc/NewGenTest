package NewGenTest.service;


import NewGenTest.converter.CourseConverter;
import NewGenTest.dao.CourseRepository;
import NewGenTest.dto.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	CourseConverter converter = new CourseConverter();

	public void add(CourseDTO dto){
		repository.save(converter.ToEntity(dto));
	}

	public ArrayList<CourseDTO> getAll(){
		return converter.toDTOList(repository.findAll());
	}

	public ArrayList<CourseDTO> getAllByCountry(String country){
		return converter.toDTOList(repository.findAllByCountry(country));
	}

	public ArrayList<CourseDTO> getAllByCountryandPrice1(String country, Float price1){
		return converter.toDTOList(repository.findAllByCountryAndPriceAfter(country, price1));
	}

	public ArrayList<CourseDTO> getAllByCountryandPrice2(String country, Float price2){
		return converter.toDTOList(repository.findAllByCountryAndPriceBefore(country, price2));
	}

	public ArrayList<CourseDTO> getAllByCountryandPrice(String country, Float price1, Float price2){
		return converter.toDTOList(repository.findAllByCountryAndPriceBetween(country, price1, price2));
	}

	public ArrayList<CourseDTO> getAllByPrice(Float price1, Float price2){
		return converter.toDTOList(repository.findAllByPriceBetween(price1, price2));
	}

	public ArrayList<CourseDTO> getAllByPrice1(Float price1){
		return converter.toDTOList(repository.findAllByPriceAfter(price1));
	}

	public ArrayList<CourseDTO> getAllByPrice2(Float price2){
		return converter.toDTOList(repository.findAllByPriceBefore(price2));
	}

}
