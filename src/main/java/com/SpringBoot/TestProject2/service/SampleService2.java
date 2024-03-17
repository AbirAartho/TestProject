package com.SpringBoot.TestProject2.service;

import com.SpringBoot.TestProject2.dto.SampleDto2;
import com.SpringBoot.TestProject2.entity.Sample2;
import com.SpringBoot.TestProject2.repository.SampleRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleService2 {
    @Autowired
    public SampleRepo2 sampleRepo2;

    public List<Sample2> getData() {
        return sampleRepo2.findAll();
    }
    public Sample2 save(Sample2 sample2) {
        return sampleRepo2.save(sample2);
    }
    public Sample2 getDataById(Long id3) {
        return sampleRepo2.findById(id3).get();
    }
    public Sample2 update(Long id3, Sample2 sample2) {
        sample2.setId3(id3);
        return sampleRepo2.save(sample2);
    }
    public void delete(Long id3) {
        sampleRepo2.deleteById(id3);
    }

    public List<SampleDto2> getDataByDate(String startDate, String endDate) {
        List<SampleDto2> sample2s = new ArrayList<>();
        for (Object[] ob :sampleRepo2.getDataByDate(startDate, endDate)
        ) {
            SampleDto2 sampleDto2 = new SampleDto2();
            sampleDto2.setInputLocation( ob[0]!=null? String.valueOf(ob[0]) : "");
            sampleDto2.setInputCO2( ob[1]!=null? String.valueOf(ob[1]) : "");
            sampleDto2.setInputTemperature( ob[2]!=null? String.valueOf(ob[2]) : "");
            sampleDto2.setInputHumidity( ob[3]!=null? String.valueOf(ob[3]) : "");
            sampleDto2.setInputSO2( ob[4]!=null? String.valueOf(ob[4]) : "");
            sampleDto2.setInputNOx( ob[5]!=null? String.valueOf(ob[5]) : "");
            sampleDto2.setInputPM( ob[6]!=null? String.valueOf(ob[6]) : "");
            sampleDto2.setInputAirVelocity( ob[7]!=null? String.valueOf(ob[7]) : "");

            sample2s.add(sampleDto2);
        }

        return sample2s;
    }
}
