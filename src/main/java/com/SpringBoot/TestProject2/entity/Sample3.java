package com.SpringBoot.TestProject2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Sample3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id4;
    private String inputDate;
    private String inputDay;
    private String inputTime;
    private String inputLocation;
    private String inputP;
    private String inputS;
    private String inputZn;
    private String inputFe;
    private String inputMn;
    private String inputCu;
    private String inputK;
    private String inputCa;
    private String inputMg;
    private String inputNa;
    private String inputOM;
    private String inputCEC;
    private String inputpH;
}
