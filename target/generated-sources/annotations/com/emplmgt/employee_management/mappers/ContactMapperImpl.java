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
    date = "2024-08-22T18:23:20+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240725-1906, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ContactMapperImpl implements ContactMapper {

    @Override
    public ContactsDTO toDTO(ContactsEntity contactsEntity) {
        if ( contactsEntity == null ) {
            return null;
        }

        ContactsDTO contactsDTO = new ContactsDTO();

        contactsDTO.setActive( contactsEntity.isActive() );
        contactsDTO.setAddressNote( contactsEntity.getAddressNote() );
        contactsDTO.setAssignedBy( contactsEntity.getAssignedBy() );
        contactsDTO.setAssignedTo( contactsEntity.getAssignedTo() );
        contactsDTO.setCity( contactsEntity.getCity() );
        contactsDTO.setCountry( contactsEntity.getCountry() );
        contactsDTO.setCreatedAt( contactsEntity.getCreatedAt() );
        contactsDTO.setCreatedBy( contactsEntity.getCreatedBy() );
        contactsDTO.setDeleted( contactsEntity.isDeleted() );
        contactsDTO.setEmail( contactsEntity.getEmail() );
        contactsDTO.setFirstName( contactsEntity.getFirstName() );
        contactsDTO.setId( contactsEntity.getId() );
        contactsDTO.setLastName( contactsEntity.getLastName() );
        contactsDTO.setLogs( toLogsDTOs( contactsEntity.getLogs() ) );
        contactsDTO.setPhone( contactsEntity.getPhone() );
        contactsDTO.setPinCode( contactsEntity.getPinCode() );
        contactsDTO.setQualified( contactsEntity.isQualified() );
        contactsDTO.setState( contactsEntity.getState() );
        contactsDTO.setStatus( contactsEntity.getStatus() );
        contactsDTO.setStreet( contactsEntity.getStreet() );
        contactsDTO.setUpdatedAt( contactsEntity.getUpdatedAt() );
        contactsDTO.setVerified( contactsEntity.isVerified() );
        contactsDTO.setVerifiedBy( contactsEntity.getVerifiedBy() );

        return contactsDTO;
    }

    @Override
    public ContactsEntity toEntity(ContactsDTO contactsDTO) {
        if ( contactsDTO == null ) {
            return null;
        }

        ContactsEntity contactsEntity = new ContactsEntity();

        contactsEntity.setActive( contactsDTO.isActive() );
        contactsEntity.setAddressNote( contactsDTO.getAddressNote() );
        contactsEntity.setAssignedBy( contactsDTO.getAssignedBy() );
        contactsEntity.setAssignedTo( contactsDTO.getAssignedTo() );
        contactsEntity.setCity( contactsDTO.getCity() );
        contactsEntity.setCountry( contactsDTO.getCountry() );
        contactsEntity.setCreatedAt( contactsDTO.getCreatedAt() );
        contactsEntity.setCreatedBy( contactsDTO.getCreatedBy() );
        contactsEntity.setDeleted( contactsDTO.isDeleted() );
        contactsEntity.setEmail( contactsDTO.getEmail() );
        contactsEntity.setFirstName( contactsDTO.getFirstName() );
        contactsEntity.setId( contactsDTO.getId() );
        contactsEntity.setLastName( contactsDTO.getLastName() );
        contactsEntity.setLogs( contactLogsDTOListToContactsLogsEntityList( contactsDTO.getLogs() ) );
        contactsEntity.setPhone( contactsDTO.getPhone() );
        contactsEntity.setPinCode( contactsDTO.getPinCode() );
        contactsEntity.setQualified( contactsDTO.isQualified() );
        contactsEntity.setState( contactsDTO.getState() );
        contactsEntity.setStatus( contactsDTO.getStatus() );
        contactsEntity.setStreet( contactsDTO.getStreet() );
        contactsEntity.setUpdatedAt( contactsDTO.getUpdatedAt() );
        contactsEntity.setVerified( contactsDTO.isVerified() );
        contactsEntity.setVerifiedBy( contactsDTO.getVerifiedBy() );

        return contactsEntity;
    }

    @Override
    public ContactLogsDTO toLogsDTO(ContactsLogsEntity contactsEntity) {
        if ( contactsEntity == null ) {
            return null;
        }

        ContactLogsDTO contactLogsDTO = new ContactLogsDTO();

        contactLogsDTO.setActionId( contactsEntity.getActionId() );
        contactLogsDTO.setCreatedAt( contactsEntity.getCreatedAt() );
        contactLogsDTO.setDescription( contactsEntity.getDescription() );
        contactLogsDTO.setId( contactsEntity.getId() );
        contactLogsDTO.setTitle( contactsEntity.getTitle() );

        return contactLogsDTO;
    }

    @Override
    public ContactsEntity toLogsEntity(ContactLogsDTO contactsDTO) {
        if ( contactsDTO == null ) {
            return null;
        }

        ContactsEntity contactsEntity = new ContactsEntity();

        contactsEntity.setCreatedAt( contactsDTO.getCreatedAt() );
        contactsEntity.setId( contactsDTO.getId() );

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

    protected ContactsLogsEntity contactLogsDTOToContactsLogsEntity(ContactLogsDTO contactLogsDTO) {
        if ( contactLogsDTO == null ) {
            return null;
        }

        ContactsLogsEntity contactsLogsEntity = new ContactsLogsEntity();

        contactsLogsEntity.setActionId( contactLogsDTO.getActionId() );
        contactsLogsEntity.setCreatedAt( contactLogsDTO.getCreatedAt() );
        contactsLogsEntity.setDescription( contactLogsDTO.getDescription() );
        contactsLogsEntity.setId( contactLogsDTO.getId() );
        contactsLogsEntity.setTitle( contactLogsDTO.getTitle() );

        return contactsLogsEntity;
    }

    protected List<ContactsLogsEntity> contactLogsDTOListToContactsLogsEntityList(List<ContactLogsDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<ContactsLogsEntity> list1 = new ArrayList<ContactsLogsEntity>( list.size() );
        for ( ContactLogsDTO contactLogsDTO : list ) {
            list1.add( contactLogsDTOToContactsLogsEntity( contactLogsDTO ) );
        }

        return list1;
    }
}
