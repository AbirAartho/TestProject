package com.SpringBoot.TestProject2.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
	@NotBlank
	private String username;

	@NotBlank
	private String password;

}
