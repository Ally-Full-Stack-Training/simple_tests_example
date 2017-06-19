package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.Data;

public @RestController
class DemoController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(){
		return "Hello World";
	}
	
	@RequestMapping(value="/hellojson", method=RequestMethod.GET)
	public Data helloJson(){
		Data d = new Data();
		d.setCount(5);
		d.setName("Hello World");
		return d;
	}
}
