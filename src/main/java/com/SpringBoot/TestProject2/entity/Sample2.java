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
public class Sample2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id3;
    private String inputDate;
    private String inputDay;
    private String inputTime;
    private String inputLocation;
    private String inputCO2;
    private String inputTemperature;
    private String inputHumidity;
    private String inputSO2;
    private String inputNOx;
    private String inputPM;
    private String inputAirVelocity;
}
