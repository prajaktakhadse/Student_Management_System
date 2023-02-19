package com.salesken.DTO;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StudentDto {

	@NotBlank
	@NotEmpty
	@NotNull
	private String name;
	

	@NotBlank
	@NotEmpty
	@NotNull
	@Email
	private String email;
	

	@NotBlank
	@NotEmpty
	@NotNull
	private String gender;
	

	@NotBlank
	@NotEmpty
	@NotNull
	private String mobileNumber;
}
