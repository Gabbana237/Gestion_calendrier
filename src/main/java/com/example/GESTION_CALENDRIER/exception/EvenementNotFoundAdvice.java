package com.example.GESTION_CALENDRIER.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EvenementNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(EvenementNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> exceptionHandler(EvenementNotFoundException exception){
		Map<String, String> errorMap=new HashMap<>();
		errorMap.put("ErrorMessage", exception.getMessage());
		
		return errorMap;
	}
}
