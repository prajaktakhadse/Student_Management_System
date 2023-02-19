package com.salesken.DTO;

import com.salesken.model.Semester;
import com.salesken.model.Subjects;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SubjectsDetailsDto {

	@NotBlank
	@NotEmpty
	@NotNull
	private Semester semester;
	
	@NotBlank
	@NotEmpty
	@NotNull
	private Subjects subjects;
	
	@NotBlank
	@NotEmpty
	@NotNull
	@Max(value = 100, message = "marks should not be more than 100")
	private double marks;
}
