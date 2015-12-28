package com.cihanblt.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.cihanblt.dao.PersonDao;
import com.cihanblt.models.Person;

@Repository
public class PersonDaoImpl implements PersonDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void addPerson(Person person){
		entityManager.persist(person);
		entityManager.close();
	}
	public List<Person> getAllPerson(){
		return null;
	}
	public Person getOnePerson(int record_id){
		entityManager.getTransaction().begin();
		Person person = (Person)entityManager.createQuery("select * from person where record_id = 1").getSingleResult();
		entityManager.close();
		return null;
	}
	
}
