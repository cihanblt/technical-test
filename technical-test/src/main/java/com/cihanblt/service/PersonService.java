package com.cihanblt.service;

import java.util.List;

import com.cihanblt.models.Person;

public interface PersonService {
	public Person getPersonelInformation(int record_id);
	public List<Person> getAllPersonelInformation();
	public void savePerson(Person person);
}
