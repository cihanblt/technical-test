package com.cihanblt.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cihanblt.dao.PersonDao;
import com.cihanblt.models.Person;

@Repository
public class PersonDaoImpl implements PersonDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void addPerson(Person person){
		entityManager.persist(person);
	}
	
	public List<Person> getAllPerson(){
		Query query = entityManager.createQuery("select p from Person p");
		List<Person> list = query.getResultList();
 		return list;
	}
	
	public Person getOnePerson(int record_id){
		Query query = entityManager.createQuery("select p from Person p where record_id = :id");
		query.setParameter("id", record_id);
		Person person = (Person)query.getSingleResult();
		return person;
	}
	
}
