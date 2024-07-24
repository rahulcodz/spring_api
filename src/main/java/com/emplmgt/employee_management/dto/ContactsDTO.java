package com.emplmgt.employee_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactsDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean verified;
    private boolean qualified;
    private Integer createBy;
    private Integer lastUpDatedBy;
    private Integer status;

    private ContactsAddressDTO address;

}
