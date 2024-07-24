package com.emplmgt.employee_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactsAddressDTO {

    private Long id;
    private String country;
    private String state;
    private Integer zip;
    private String street;

}
