package com.emplmgt.employee_management.mappers;

import com.emplmgt.employee_management.dto.UsersDTO;
import com.emplmgt.employee_management.entities.UsersEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-22T12:46:01+0530",
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

        return usersDTO;
    }

    @Override
    public UsersEntity toEntity(UsersDTO usersDTO) {
        if ( usersDTO == null ) {
            return null;
        }

        UsersEntity usersEntity = new UsersEntity();

        return usersEntity;
    }
}
