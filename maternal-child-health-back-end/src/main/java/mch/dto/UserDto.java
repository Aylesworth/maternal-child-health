package mch.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
	private Long id;
	private String email;
	
	@NotEmpty
	private String fullName;
	
	@Pattern(regexp = "[0-9]+")
	private String citizenId;
	
	@NotNull
	private Date dob;
	
	@NotEmpty
	private String sex;
	
	@NotEmpty
	@Pattern(regexp = "[0-9]{10,12}")
	private String phoneNumber;
	
	@NotEmpty
	private String address;
	
	@Pattern(regexp = "[A-Z0-9]{12,18}")
	private String insuranceId;
}
