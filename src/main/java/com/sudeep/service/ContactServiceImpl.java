package com.sudeep.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudeep.entity.ContactEntity;
import com.sudeep.model.Contact;
import com.sudeep.repository.ContactRepository;

/**
 * @author sudeep
 *
 */
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repository;

	/**
	 * This methods save the contact
	 *
	 */
	@Override
	public boolean saveContact(Contact contact) {
		ContactEntity contactEntity = new ContactEntity();
		BeanUtils.copyProperties(contact, contactEntity);
		ContactEntity saveEntity = repository.save(contactEntity);
		return (saveEntity != null);
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
