package NewGenTest.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseDTO {

	private Long id;
	private String country;
	private Float price;

}
