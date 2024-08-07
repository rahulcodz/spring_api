package com.emplmgt.employee_management.repositories;

import com.emplmgt.employee_management.entities.ContactsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactsRepository extends JpaRepository<ContactsEntity, Long> {
    @Query("SELECT c FROM ContactsEntity c LEFT JOIN FETCH c.logs WHERE c.isDeleted = false")
    List<ContactsEntity> findAllWithLogs();

    @Query("SELECT c FROM ContactsEntity c LEFT JOIN FETCH c.logs WHERE c.id = :id AND c.isDeleted = false")
    ContactsEntity findByIdWithLogs(@Param("id") Long id);

}
