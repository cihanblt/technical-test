package com.cihanblt.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cihanblt.models.Person;

@RestController("/controller")
public class TestController {
	
	@RequestMapping(value="/test",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String test(){
		String r = "test page";
		return r;
	}
	@RequestMapping(value="/get-personel/{record_id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Person getPersonel(@PathVariable long record_id){
		return null;
	}
	@RequestMapping(value="/get-personel/{record_id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Person addPersonel(@RequestBody Person person){
		return null;
	}
}
