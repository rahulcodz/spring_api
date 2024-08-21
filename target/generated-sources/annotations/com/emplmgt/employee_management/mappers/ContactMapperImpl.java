package com.emplmgt.employee_management.mappers;

import com.emplmgt.employee_management.dto.ContactLogsDTO;
import com.emplmgt.employee_management.dto.ContactsDTO;
import com.emplmgt.employee_management.entities.ContactsEntity;
import com.emplmgt.employee_management.entities.ContactsLogsEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-21T17:07:59+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class ContactMapperImpl implements ContactMapper {

    @Override
    public ContactsDTO toDTO(ContactsEntity contactsEntity) {
        if ( contactsEntity == null ) {
            return null;
        }

        ContactsDTO contactsDTO = new ContactsDTO();

        return contactsDTO;
    }

    @Override
    public ContactsEntity toEntity(ContactsDTO contactsDTO) {
        if ( contactsDTO == null ) {
            return null;
        }

        ContactsEntity contactsEntity = new ContactsEntity();

        return contactsEntity;
    }

    @Override
    public ContactLogsDTO toLogsDTO(ContactsLogsEntity contactsEntity) {
        if ( contactsEntity == null ) {
            return null;
        }

        ContactLogsDTO contactLogsDTO = new ContactLogsDTO();

        return contactLogsDTO;
    }

    @Override
    public ContactsEntity toLogsEntity(ContactLogsDTO contactsDTO) {
        if ( contactsDTO == null ) {
            return null;
        }

        ContactsEntity contactsEntity = new ContactsEntity();

        return contactsEntity;
    }

    @Override
    public List<ContactsDTO> toDTOs(List<ContactsEntity> contactsEntity) {
        if ( contactsEntity == null ) {
            return null;
        }

        List<ContactsDTO> list = new ArrayList<ContactsDTO>( contactsEntity.size() );
        for ( ContactsEntity contactsEntity1 : contactsEntity ) {
            list.add( toDTO( contactsEntity1 ) );
        }

        return list;
    }

    @Override
    public List<ContactsEntity> toEntities(List<ContactsDTO> contactsDTO) {
        if ( contactsDTO == null ) {
            return null;
        }

        List<ContactsEntity> list = new ArrayList<ContactsEntity>( contactsDTO.size() );
        for ( ContactsDTO contactsDTO1 : contactsDTO ) {
            list.add( toEntity( contactsDTO1 ) );
        }

        return list;
    }

    @Override
    public List<ContactLogsDTO> toLogsDTOs(List<ContactsLogsEntity> contactsEntity) {
        if ( contactsEntity == null ) {
            return null;
        }

        List<ContactLogsDTO> list = new ArrayList<ContactLogsDTO>( contactsEntity.size() );
        for ( ContactsLogsEntity contactsLogsEntity : contactsEntity ) {
            list.add( toLogsDTO( contactsLogsEntity ) );
        }

        return list;
    }

    @Override
    public List<ContactsEntity> toLogsEntities(List<ContactLogsDTO> contactsDTO) {
        if ( contactsDTO == null ) {
            return null;
        }

        List<ContactsEntity> list = new ArrayList<ContactsEntity>( contactsDTO.size() );
        for ( ContactLogsDTO contactLogsDTO : contactsDTO ) {
            list.add( toLogsEntity( contactLogsDTO ) );
        }

        return list;
    }
}
