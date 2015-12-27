package com.cihanblt.service;

import java.util.List;

import com.cihanblt.models.Person;

public interface PersonService {
	public Person getPersonelInformation(long record_id);
	public List<Person> getAllPersonelInformation();
}
