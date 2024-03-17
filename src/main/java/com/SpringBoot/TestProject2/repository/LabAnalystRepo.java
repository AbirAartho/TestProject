package com.SpringBoot.TestProject2.repository;

import com.SpringBoot.TestProject2.entity.LabAnalyst;
import com.SpringBoot.TestProject2.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabAnalystRepo extends JpaRepository<LabAnalyst, Long> {
}
