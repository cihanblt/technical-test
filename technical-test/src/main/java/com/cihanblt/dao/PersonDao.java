package com.cihanblt.dao;

import java.util.List;


import com.cihanblt.models.Person;

public interface PersonDao{
	public Person getOnePerson(int record_id);
	public List<Person> getAllPerson();
	public void addPerson(Person person);
}
