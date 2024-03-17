package com.SpringBoot.TestProject2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class LabAnalyst {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String inputFname;
    private String inputLname;
    private String inputEmail ;
    private String inputPassword;
    private String inputAddress;
    private String inputAddress2;
    private String inputCity;
    private String inputZip;
    private String gridCheck;
    private String radioCheck;
    private String department;
    private String designation;
    private String role;
}
