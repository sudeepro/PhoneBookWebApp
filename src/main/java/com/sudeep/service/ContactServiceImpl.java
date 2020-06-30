package com.sudeep.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sudeep.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Override
	public boolean saveContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer cid) {
		
		return null;
	}

	@Override
	public boolean updateContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
