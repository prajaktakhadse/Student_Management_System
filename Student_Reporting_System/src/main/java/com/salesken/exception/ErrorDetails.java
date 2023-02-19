package com.salesken.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
	private LocalDateTime timeStamp;
	private String message;
	private HttpStatus httpStatus;
	private String details;
}
