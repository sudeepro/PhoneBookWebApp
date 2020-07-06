package com.sudeep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sudeep.model.Contact;
import com.sudeep.service.ContactService;

/**
 * @author sudeep
 *
 */
@Controller
public class ContactInfoController {

	@Autowired
	private ContactService service;

	/**
	 * This method is used to load contact form
	 * 
	 * @param model
	 * @return string
	 */
	@GetMapping(value = { "/", "/addContact" })
	public String loadForm(Model model) {
		model.addAttribute("contact", new Contact());
		return "contactInfo";
	}

	/**
	 * This method is used to save contact.
	 * 
	 * @param c
	 * @param attributes
	 * @return String
	 */
	@PostMapping(name = "/saveContact")
	public String handleSubmitBtn(@ModelAttribute("contact") Contact c, RedirectAttributes attributes) {
		boolean isSaved = service.saveContact(c);
		if (isSaved) {
			attributes.addFlashAttribute("successMessage", "Contact is saved");
		} else {
			attributes.addFlashAttribute("errorMessage", "Contact is not saved");
		}
		return "/redirect:createContactSuccess";
	}

	/**
	 * This method is used to display all contacts
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping("/viewContact")
	public String handleViewContactsLink(Model model) {
		List<Contact> contactList = service.getAllContacts();
		model.addAttribute("contact", contactList);
		return "viewContact";
	}

	/**
	 * This is uses PRG Pattern
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping(value = "/createContactSuccess")
	public String createContactSuccess(Model model) {
		model.addAttribute("contact", new Contact());
		return "contactInfo";

	}

}
