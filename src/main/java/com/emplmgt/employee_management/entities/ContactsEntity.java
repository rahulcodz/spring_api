package com.emplmgt.employee_management.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_contacts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactsEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private ContactsAddressEntity address;
}
