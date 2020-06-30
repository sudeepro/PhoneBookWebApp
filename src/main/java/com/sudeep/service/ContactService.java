package com.sudeep.service;

import java.util.List;

import com.sudeep.model.Contact;

public interface ContactService {

	public boolean saveContact(Contact c);

	public List<Contact> getAllContacts();

	public Contact getContactById(Integer cid);

	public boolean updateContact(Contact c);

	public boolean deleteContact(Integer cid);
}
