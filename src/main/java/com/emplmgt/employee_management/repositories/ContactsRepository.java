package com.emplmgt.employee_management.repositories;

import com.emplmgt.employee_management.entities.ContactsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<ContactsEntity, Long> {
}
