package NewGenTest;


import NewGenTest.dto.CourseDTO;
import NewGenTest.model.Course;
import NewGenTest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import java.time.Instant;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

	@Bean
	CommandLineRunner run(CourseService service) {

		return args -> {
			service.add(
					new CourseDTO(
							null,
							"Russia",
							(float) 300
					)
			);
			service.add(
					new CourseDTO(
							null,
							"Germany",
							(float) 550
					)
			);
			service.add(
					new CourseDTO(
							null,
							"Italy",
							(float) 120
					)
			);
			service.add(
					new CourseDTO(
							null,
							"England",
							(float) 0
					)
			);
			service.add(
					new CourseDTO(
							null,
							"China",
							(float) 75
					)
			);
			service.add(
					new CourseDTO(
							null,
							"USA",
							(float) 800
					)
			);
			service.add(
					new CourseDTO(
							null,
							"Kazakhstan",
							(float) 300
					)
			);
			service.add(
					new CourseDTO(
							null,
							"France",
							(float) 500
					)
			);
		};
	}
}
