package com.emplmgt.employee_management.mappers;

import com.emplmgt.employee_management.dto.ContactsAddressDTO;
import com.emplmgt.employee_management.dto.ContactsDTO;
import com.emplmgt.employee_management.entities.ContactsAddressEntity;
import com.emplmgt.employee_management.entities.ContactsEntity;
import com.emplmgt.employee_management.entities.UserEntity;

public class ContactMapper {
    public static ContactsDTO toDTO(ContactsEntity contacts) {
        return new ContactsDTO(
                contacts.getId(),
                contacts.getFirstName(),
                contacts.getLastName(),
                contacts.getEmail(),
                contacts.getPhone(),
                contacts.isVerified(),
                contacts.isQualified(),
                contacts.getCreateBy(),
                contacts.getLastUpDatedBy(),
                contacts.getStatus(),
                new ContactsAddressDTO(
                        contacts.getAddress().getId(),
                        contacts.getAddress().getCountry(),
                        contacts.getAddress().getState(),
                        contacts.getAddress().getZip(),
                        contacts.getAddress().getStreet()
                )
        );
    }

    public static ContactsEntity toEntity(ContactsDTO contacts) {
        return new ContactsEntity(
                contacts.getId(),
                contacts.getFirstName(),
                contacts.getLastName(),
                contacts.getEmail(),
                contacts.getPhone(),
                contacts.isVerified(),
                contacts.isQualified(),
                contacts.getCreateBy(),
                contacts.getLastUpDatedBy(),
                contacts.getStatus(),
                new ContactsAddressEntity(
                        contacts.getAddress().getId(),
                        contacts.getAddress().getCountry(),
                        contacts.getAddress().getState(),
                        contacts.getAddress().getZip(),
                        contacts.getAddress().getStreet()
                )
        );
    }
}
