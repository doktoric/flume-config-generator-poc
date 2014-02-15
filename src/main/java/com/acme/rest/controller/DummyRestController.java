package com.acme.doktoric.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.*;


@Controller
public class DummyRestController {

	@Value("${test.msg:gohome}")
	private String msg;
	
	@RequestMapping(value = "/test")
	public @ResponseBody
	String test() {
		return msg;
	};
	

}
