package com.emplmgt.employee_management.mappers;

import com.emplmgt.employee_management.dto.UsersDTO;
import com.emplmgt.employee_management.entities.UsersEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-21T17:08:18+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public UsersDTO toDTO(UsersEntity usersEntity) {
        if ( usersEntity == null ) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();

        usersDTO.setId( usersEntity.getId() );
        usersDTO.setUserName( usersEntity.getUserName() );
        usersDTO.setUserEmail( usersEntity.getUserEmail() );
        usersDTO.setPassword( usersEntity.getPassword() );
        usersDTO.setFirstName( usersEntity.getFirstName() );
        usersDTO.setLastName( usersEntity.getLastName() );
        usersDTO.setPhone( usersEntity.getPhone() );
        usersDTO.setUserRole( usersEntity.getUserRole() );
        usersDTO.setActive( usersEntity.isActive() );
        usersDTO.setJoiningDate( usersEntity.getJoiningDate() );
        usersDTO.setLeavingDate( usersEntity.getLeavingDate() );

        return usersDTO;
    }

    @Override
    public UsersEntity toEntity(UsersDTO usersDTO) {
        if ( usersDTO == null ) {
            return null;
        }

        UsersEntity usersEntity = new UsersEntity();

        usersEntity.setId( usersDTO.getId() );
        usersEntity.setUserName( usersDTO.getUserName() );
        usersEntity.setUserEmail( usersDTO.getUserEmail() );
        usersEntity.setPassword( usersDTO.getPassword() );
        usersEntity.setFirstName( usersDTO.getFirstName() );
        usersEntity.setLastName( usersDTO.getLastName() );
        usersEntity.setPhone( usersDTO.getPhone() );
        usersEntity.setUserRole( usersDTO.getUserRole() );
        usersEntity.setActive( usersDTO.isActive() );
        usersEntity.setJoiningDate( usersDTO.getJoiningDate() );
        usersEntity.setLeavingDate( usersDTO.getLeavingDate() );

        return usersEntity;
    }
}
