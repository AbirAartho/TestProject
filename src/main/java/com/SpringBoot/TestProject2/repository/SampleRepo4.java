package com.SpringBoot.TestProject2.repository;

import com.SpringBoot.TestProject2.entity.Sample;
import com.SpringBoot.TestProject2.entity.Sample4;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepo4 extends JpaRepository<Sample4, Long> {
}
