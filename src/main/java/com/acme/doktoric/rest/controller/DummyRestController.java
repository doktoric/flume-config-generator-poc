package com.acme.doktoric.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.*;


@Controller
public class DummyRestController {

	@Value("${test.msg:gohome}")
	private String msg;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
		return msg;
	};

    @RequestMapping(value = "/config", method = RequestMethod.POST)
    @ResponseBody
    public String saveConfig(@RequestParam("flumeConfig") String flumeConfig,
                             @RequestParam("morphlineConfig") String morphlineConfig,
                             @RequestParam("user") String user) {
        return msg;
    };

}
