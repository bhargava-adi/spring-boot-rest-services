package org.spring.boot.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SpringBootRestException {

	@ExceptionHandler(value = SpringBootRestEntityNotFoundException.class)
	public ResponseEntity<String> entityNotFoundException(SpringBootRestEntityNotFoundException exception) {
		return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = SpringBootRestEntityNotSavedException.class)
	public ResponseEntity<String> entityNotSavedException(SpringBootRestEntityNotSavedException exception) {
		return new ResponseEntity<>("Product not saved", HttpStatus.BAD_REQUEST);
	}

}