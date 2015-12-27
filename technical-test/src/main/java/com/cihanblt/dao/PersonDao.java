package com.cihanblt.dao;

import java.util.List;

import com.cihanblt.models.Person;

public interface PersonDao {
	public Person getOnePerson(long record_id);
	public List<Person> getAllPerson();
}
