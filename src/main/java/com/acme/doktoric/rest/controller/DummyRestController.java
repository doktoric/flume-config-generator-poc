package com.acme.doktoric.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import java.util.Map;


@Controller
public class DummyRestController {

	@Value("${test.msg:gohome}")
	private String msg;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
		return msg;
	}

    @RequestMapping(value = "/config", method = RequestMethod.POST)
    @ResponseBody
    public String saveConfig(@RequestBody Map<String, String> body) {
       // File file = new File(flumePath + "one.txt");
        //Files.createParentDirs(file);
        //Files.touch(file);
        return body.get("company")+body.get("morphline")+body.get("sink")+body.get("source");
    }

}
