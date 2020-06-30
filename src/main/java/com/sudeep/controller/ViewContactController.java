package com.sudeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.sudeep.model.Contact;
import com.sudeep.service.ContactService;

/**
 * @author sudeep
 *
 */
@Controller
public class ViewContactController {

	@Autowired
	private ContactService service;
	
	
	public String editContact(Integer contactId) {
		return null;
	}
	
	@PostMapping("/")
	public String updateContact(Contact c, Model model) {
		return null;
	}
	
	public String deleteContact(Integer contactId) {
		return null;
	}
}
