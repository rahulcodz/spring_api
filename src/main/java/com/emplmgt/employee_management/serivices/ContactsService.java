package com.emplmgt.employee_management.serivices;

import com.emplmgt.employee_management.dto.ContactsDTO;
import com.emplmgt.employee_management.entities.ContactsEntity;
import com.emplmgt.employee_management.mappers.ContactMapper;
import com.emplmgt.employee_management.repositories.ContactsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactsService {
    final ContactsRepository contactsRepository;

    public ContactsService(ContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    public ContactsDTO createContacts(ContactsDTO contactsDTO) {
        ContactsEntity userEntity = ContactMapper.toEntity(contactsDTO);
        ContactsEntity savedData = contactsRepository.save(userEntity);
        return ContactMapper.toDTO(savedData);
    }

    public List<ContactsDTO> getContacts() {
        List<ContactsEntity> contactData = contactsRepository.findAll();
        return contactData.stream()
                .map(ContactMapper::toDTO)
                .collect(Collectors.toList());
    }

}
