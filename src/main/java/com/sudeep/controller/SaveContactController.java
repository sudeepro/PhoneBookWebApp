package com.sudeep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sudeep.model.Contact;
import com.sudeep.service.ContactService;

public class SaveContactController {

	@Autowired
	private ContactService service;

	@GetMapping("/showContacts")
	public String loadForm(Model model) {
		List<Contact> allContacts = service.getAllContacts();
		model.addAttribute("contacts", "allcontacts");
		return "viewContacts";
	}

	@PostMapping(name = "/saveContacts")
	public String handleSubmitBtn(@ModelAttribute("contact") Contact c, Model model) {
		boolean isSaved = service.saveContact(c);
		if (isSaved) {
			model.addAttribute("successMessage", "Contact saved");
		} else {
			model.addAttribute("errorMessage", "Contact is not saved");
		}
		return "contactInfo";
	}

	public String handleViewContactsLink(Model model) {
		return null;
	}

}
