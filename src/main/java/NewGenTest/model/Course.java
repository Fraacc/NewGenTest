package NewGenTest.model;

import javax.persistence.Entity;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Course {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
    private String country;
	private Float price;


}
