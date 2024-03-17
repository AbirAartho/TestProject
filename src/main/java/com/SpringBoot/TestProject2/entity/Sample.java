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
public class Sample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id2;
    private String inputDate;
    private String inputDay;
    private String inputTime;
    private String inputLocation;
    private String inputTurbidity;
    private String inputTemperature;
    private String inputColour;
    private String inputTasteAndOdour;
    private String inputSolids;
    private String inputEC;
    private String inputpH;
    private String inputChloride;
    private String inputChlorine;
    private String inputSulphate;
    private String inputNitrogen;
    private String inputFluoride;
    private String inputFe_Mn;
    private String inputCu_Zn;
    private String inputHardness;
    private String inputDO;
    private String inputBOD;


    public void setId2(Long id2) {
    }
}
