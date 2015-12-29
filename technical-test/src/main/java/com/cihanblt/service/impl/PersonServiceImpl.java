package com.cihanblt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cihanblt.dao.PersonDao;
import com.cihanblt.models.Person;
import com.cihanblt.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;

	@Override
	public Person getPersonelInformation(int record_id) {
		return personDao.getOnePerson(record_id);
	}

	@Override
	public List<Person> getAllPersonelInformation() {
		return personDao.getAllPerson();
	}

	@Override
	@Transactional
	public void savePerson(Person person) {
		personDao.addPerson(person);
		
	}

}
