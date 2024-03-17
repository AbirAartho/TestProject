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
public class Sample4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id5;
    private String inputDate;
    private String inputDay;
    private String inputTime;
    private String inputLocation;
    private String inputArea;
    private String inputAmount;
    private String inputQuantity;
    private String inputDepth;
    private String inputType;
    private String inputCollection;
}
