package com.example.springmvc.spring_inmemory_demo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerErrorResponse {
	private int statusCode;
	private String message;
	private  long logTime;

}
