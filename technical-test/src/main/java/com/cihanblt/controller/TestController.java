package com.cihanblt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cihanblt.models.Address;
import com.cihanblt.models.Person;
import com.cihanblt.service.AddressService;
import com.cihanblt.service.PersonService;

@RestController
@RequestMapping(value="/controller")
public class TestController {
	@Autowired
	private PersonService personService;
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String test(){
		String r = "test page";
		return r;
	}
	@RequestMapping(value="/get-personel/{record_id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Person getPersonel(@PathVariable int record_id){
		Person person = (Person)personService.getPersonelInformation(record_id);
		return person;
	}
	@RequestMapping(value="/get-all-personel",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Person> getPersonel(){
		return  personService.getAllPersonelInformation();
		
	}
	@RequestMapping(value="/save-personel",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Person> addPersonel(@RequestBody Person person,HttpServletResponse response,HttpServletRequest request){
		Person person2 = new Person();
		person2.setName(person.getName());
		person2.setAge(person.getAge());
		personService.savePerson(person2);

		for(Address addr : person.getAddress()){
			Address address = new Address();
			address.setPerson(person2);
			address.setStreetName(addr.getStreetName());
			address.setHouseNumber(addr.getHouseNumber());
			address.setCity(addr.getStreetName());
			addressService.addNewAddress(address);
		}
		
		return new ResponseEntity<Person>(person2,HttpStatus.OK);
	}
}
