package com.sudeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sudeep.model.Contact;
import com.sudeep.service.ContactService;

public class SaveContactController {

	@Autowired
	private ContactService service;
	
	@GetMapping("/showContacts")
	public String loadForm(Model model) {

		return null;

	}
	
	@PostMapping(name = "/saveContacts")
	public String handleSubmitBtn(Contact c, Model model) {
		return null;

	}

	public String handleViewContactsLink(Model model) {
		return null;
	}

}
