package com.mypack.dto;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessResponse {

//	public SuccessResponse(HttpStatus httpStatus, String message) {
//		super();
//		this.httpStatus = httpStatus;
//		this.message = message;
//	}
	public SuccessResponse(HttpStatus ok, String message2) {
		// TODO Auto-generated constructor stub
	}
	private HttpStatus httpStatus;
	private String message;
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
