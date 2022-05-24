package NewGenTest.converter;


import NewGenTest.dto.CourseDTO;
import NewGenTest.model.Course;
import java.util.ArrayList;


public class CourseConverter  {



	public Course ToEntity(CourseDTO dto) {
		Course course = new Course(dto.getId(),dto.getCountry(),dto.getPrice());
		return course;
	}

	public CourseDTO ToDto(Course course) {
		CourseDTO dto = new CourseDTO(course.getId(),course.getCountry(),course.getPrice());
		return dto;
	}


	public ArrayList<CourseDTO> toDTOList(ArrayList<Course> model) {
		ArrayList<CourseDTO> list = new ArrayList<>();

		for (Course course : model) {
			list.add(ToDto(course));
		}
		return list;
	}
}