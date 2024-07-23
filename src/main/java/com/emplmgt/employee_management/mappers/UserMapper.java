package com.emplmgt.employee_management.mappers;

import com.emplmgt.employee_management.dto.UserDTO;
import com.emplmgt.employee_management.entities.UserEntity;

public class UserMapper {
    public static UserDTO toDTO(UserEntity user) {
        return new UserDTO(
                user.getId(),
                user.getUserName(),
                user.getEmail(),
                user.getName(),
                user.isActive()
        );
    }

    public static UserEntity toEntity(UserDTO user) {
        return new UserEntity(
                user.getId(),
                user.getUserName(),
                user.getEmail(),
                user.getName(),
                user.isActive()
        );
    }
}
