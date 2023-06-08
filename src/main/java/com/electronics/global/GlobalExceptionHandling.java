package com.electronics.global;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.electronics.exception.LowpriceException;

@RestControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler(LowpriceException.class)
	public ResponseEntity<Object> lowPriceHandle() {
		return new ResponseEntity<Object>("You are not eligible", HttpStatus.BAD_REQUEST);
	}
}
