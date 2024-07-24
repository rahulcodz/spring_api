package com.emplmgt.employee_management.controllers;

import com.emplmgt.employee_management.dto.ContactsDTO;
import com.emplmgt.employee_management.serivices.ContactsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/contacts")
public class ContactsController {

    private final ContactsService contactsService;

    public ContactsController(ContactsService contactsService) {
        this.contactsService = contactsService;
    }


    @PostMapping
    public ContactsDTO createContacts(@RequestBody ContactsDTO contactsDTO) {
        return contactsService.createContacts(contactsDTO);
    }

    @GetMapping
    public List<ContactsDTO> getContacts(){
        return contactsService.getContacts();
    }
}
