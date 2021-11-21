package com.njmp.userservice.repo;

import com.njmp.userservice.domain.Role;
import com.njmp.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
