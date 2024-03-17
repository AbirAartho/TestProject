package com.SpringBoot.TestProject2.repository;


import com.SpringBoot.TestProject2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
    boolean existsByRoleNameIgnoreCase(String roleName);
}
