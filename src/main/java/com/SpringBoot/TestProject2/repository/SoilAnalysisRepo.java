package com.SpringBoot.TestProject2.repository;

import com.SpringBoot.TestProject2.entity.Sample3;
import com.SpringBoot.TestProject2.entity.SoilAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoilAnalysisRepo extends JpaRepository<SoilAnalysis, Long> {
}
