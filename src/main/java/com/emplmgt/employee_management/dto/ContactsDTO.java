package com.emplmgt.employee_management.dto;

import com.emplmgt.employee_management.enums.UserRole;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ContactsDTO {
    private Long id;
    private String userName;
    private String userEmail;
    private String firstName;
    private String lastName;
    private String description;
    private String phone;
    private String password;
    private UserRole userRole;
    private boolean isDeleted;
    private boolean isActive;
    private LocalDateTime joiningDate;
    private LocalDateTime leavingDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String country;
    private String pinCode;
    private String state;
    private String city;
    private String street;
    private String addressNote;

    private List<ContactLogsDTO> logs;

}
