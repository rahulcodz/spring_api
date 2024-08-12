package com.emplmgt.employee_management.repositories;

import com.emplmgt.employee_management.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
