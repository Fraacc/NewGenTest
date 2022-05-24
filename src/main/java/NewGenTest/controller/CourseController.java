package NewGenTest.controller;

import NewGenTest.dto.CourseDTO;
import NewGenTest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/course")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

	@Autowired
	private CourseService service;

	@PostMapping("/getAll")
	public ArrayList<CourseDTO> getAll(){
		System.out.println("Tutte\n");
		return service.getAll();
	}

	@PostMapping("/getAllWithParams")
	public ArrayList<CourseDTO> getAllWithParams(@RequestParam("country") String country, @RequestParam("price1") Float price1, @RequestParam("price2") Float price2) {
		System.out.println("fatto/n");
		if (country == "" && price1 == null && price2 == null) {
			return service.getAll();
		}
		if (price1 == null && price2 == null) {
			return service.getAllByCountry(country);
		}
		if (country == "" && price1 == null) {
			return service.getAllByPrice2(price2);
		}
		if (country == "" && price2 == null) {
			return service.getAllByPrice1(price1);
		}
		if (price2 == null) {
			return service.getAllByCountryandPrice1(country, price1);
		}
		if (price1 == null) {
			return service.getAllByCountryandPrice2(country, price2);
		}
		if (country == "") {
			return service.getAllByPrice(price1, price2);
		} else {
			return service.getAllByCountryandPrice(country, price1, price2);
		}
	}



}

