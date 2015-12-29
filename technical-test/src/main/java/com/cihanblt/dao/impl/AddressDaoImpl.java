package com.cihanblt.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cihanblt.dao.AddressDao;
import com.cihanblt.models.Address;

@Repository
public class AddressDaoImpl implements AddressDao{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void saveNewAddress(Address address) {
		entityManager.persist(address);		
	}
	
}
