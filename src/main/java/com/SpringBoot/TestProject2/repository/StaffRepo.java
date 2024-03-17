package com.SpringBoot.TestProject2.repository;

import com.SpringBoot.TestProject2.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StaffRepo extends JpaRepository<Staff, Long> {
}
