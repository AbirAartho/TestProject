package com.SpringBoot.TestProject2.service;

import com.SpringBoot.TestProject2.dto.SampleDto;
import com.SpringBoot.TestProject2.dto.SampleDto2;
import com.SpringBoot.TestProject2.entity.Sample;
import com.SpringBoot.TestProject2.repository.SampleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleService {
    @Autowired
    public SampleRepo sampleRepo;

    public List<Sample> getData() {
        return sampleRepo.findAll();
    }
    public Sample save(Sample sample) {
        return sampleRepo.save(sample);
    }
    public Sample getDataById(Long id2) {
        return sampleRepo.findById(id2).get();
    }
    public Sample update(Long id2, Sample sample) {
        sample.setId2(id2);
        return sampleRepo.save(sample);
    }
    public void delete(Long id2) {
        sampleRepo.deleteById(id2);
    }

    public List<SampleDto> getDataByDate(String startDate, String endDate) {
        List<SampleDto> samples = new ArrayList<>();
        for (Object[] ob :sampleRepo.getDataByDate(startDate, endDate)
        ) {
            SampleDto sampleDto = new SampleDto();
            sampleDto.setInputLocation( ob[0]!=null? String.valueOf(ob[0]) : "");
            sampleDto.setInputTurbidity( ob[1]!=null? String.valueOf(ob[1]) : "");
            sampleDto.setInputTemperature( ob[2]!=null? String.valueOf(ob[2]) : "");
            sampleDto.setInputColour( ob[3]!=null? String.valueOf(ob[3]) : "");
            sampleDto.setInputTasteAndOdour( ob[4]!=null? String.valueOf(ob[4]) : "");
            sampleDto.setInputSolids( ob[5]!=null? String.valueOf(ob[5]) : "");
            sampleDto.setInputEC( ob[6]!=null? String.valueOf(ob[6]) : "");
            sampleDto.setInputpH( ob[7]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputChloride( ob[8]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputChlorine( ob[9]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputSulphate( ob[10]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputNitrogen( ob[11]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputFluoride( ob[12]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputFe_Mn( ob[13]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputCu_Zn( ob[14]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputHardness( ob[15]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputDO( ob[16]!=null? String.valueOf(ob[7]) : "");
            sampleDto.setInputBOD( ob[17]!=null? String.valueOf(ob[7]) : "");

            samples.add(sampleDto);
        }

        return samples;
    }
}
