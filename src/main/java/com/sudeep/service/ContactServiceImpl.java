package com.sudeep.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
		List<ContactEntity> entities = repository.findAll();
		return entities.stream().map(entity -> {
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			return contact;
		}).collect(Collectors.toList());
	}

	@Override
	public Contact getContactById(Integer cid) {
		Optional<ContactEntity> findById = repository.findById(cid);
		if (findById.isPresent()) {
			ContactEntity contactEntity = findById.get();
			Contact contact = new Contact();
			BeanUtils.copyProperties(contactEntity, contact);
 		}
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
