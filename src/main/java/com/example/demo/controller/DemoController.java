package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.Data;

public @RestController
class DemoController {

	/**
	 * This endpoint returns plain text
	 * @return
	 */
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(){
		return "Hello World";
	}

	/**
	 * This endpoint returns a json object consisting of a 'Data' object
	 * @return
	 */
	@RequestMapping(value="/hellojson", method=RequestMethod.GET)
	public Data helloJson(){
		Data d = new Data();
		d.setCount(5);
		d.setName("Hello World");
		return d;
	}
}
