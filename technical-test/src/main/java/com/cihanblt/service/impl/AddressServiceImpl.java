package com.cihanblt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cihanblt.dao.AddressDao;
import com.cihanblt.models.Address;
import com.cihanblt.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDao addressDao;
	@Override
	@Transactional
	public void addNewAddress(Address address) {
		addressDao.saveNewAddress(address);
	}

}
