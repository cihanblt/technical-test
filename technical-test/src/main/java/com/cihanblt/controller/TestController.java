package com.cihanblt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cihanblt.models.Address;
import com.cihanblt.models.Person;
import com.cihanblt.service.PersonService;

@RestController
@RequestMapping(value="/controller")
public class TestController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String test(){
		String r = "test page";
		return r;
	}
	@RequestMapping(value="/get-personel/{record_id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Person getPersonel(@PathVariable int record_id){
		return null;
	}
	@RequestMapping(value="/save-personel",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String addPersonel(@RequestBody @Validated Person person,HttpServletResponse response,HttpServletRequest request){
		Person person2 = new Person();
		person2.setName(person.getName());
		person2.setAge(person.getAge());
		
//		for(Address addr : person.getAddress()){
//			Address address = new Address();
//			address.setStreetName(addr.getStreetName());
//			address.setHouseNumber(addr.getHouseNumber());
//			address.setCity(addr.getStreetName());
//		}
//		person2.setAddress(person.getAddress());
		
		personService.savePerson(person2);
		return "sonuc";
	}
}
