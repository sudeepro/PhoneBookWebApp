package com.sudeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("/editContact")
	public String editContact(@RequestParam("cid") Integer contactId, Model model) {
		Contact contactById = service.getContactById(contactId);
		model.addAttribute("contact", contactById);
		return "saveContact";
	}

	@PostMapping("/update")
	public String updateContact(@ModelAttribute("contact") Contact c, Model model) {
		return null;
	}

	public String deleteContact(Integer contactId) {
		boolean isDeleted = service.deleteContact(contactId);
		if (isDeleted) {
			return "redirect:/showConatacts";
		}
		return null;

	}
}
