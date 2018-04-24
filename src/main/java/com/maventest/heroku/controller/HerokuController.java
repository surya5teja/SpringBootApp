package com.maventest.heroku.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/heroku")
public class HerokuController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testMethod() {
		return "surya tej";
	}
}
