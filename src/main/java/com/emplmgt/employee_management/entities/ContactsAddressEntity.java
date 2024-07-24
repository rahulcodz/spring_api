package com.emplmgt.employee_management.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_contact_address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactsAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String state;
    private Integer zip;
    private String street;
}
