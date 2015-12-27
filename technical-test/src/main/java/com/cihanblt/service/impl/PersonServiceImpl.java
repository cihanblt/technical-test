package com.cihanblt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cihanblt.dao.PersonDao;
import com.cihanblt.models.Person;
import com.cihanblt.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;
	
	@Override
	public Person getPersonelInformation(long record_id) {
		return personDao.getOnePerson(record_id);
	}

	@Override
	public List<Person> getAllPersonelInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}
