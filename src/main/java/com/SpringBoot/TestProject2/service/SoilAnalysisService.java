package com.SpringBoot.TestProject2.service;

import com.SpringBoot.TestProject2.dto.SampleDto3;
import com.SpringBoot.TestProject2.entity.Sample3;
import com.SpringBoot.TestProject2.repository.SampleRepo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoilAnalysisService {
    @Autowired
    public SampleRepo3 sampleRepo3;

    public List<Sample3> getData() {
        return sampleRepo3.findAll();
    }
    public Sample3 save(Sample3 sample3) {
        return sampleRepo3.save(sample3);
    }
    public Sample3 getDataById(Long id4) {
        return sampleRepo3.findById(id4).get();
    }
    public Sample3 update(Long id4, Sample3 sample3) {
        sample3.setId4(id4);
        return sampleRepo3.save(sample3);
    }
    public void delete(Long id4) {
        sampleRepo3.deleteById(id4);
    }

//    public List<SampleDto3> getDataByDate(String startDate, String endDate) {
//        return sampleRepo3.getDataByDate(startDate, endDate);
//    }

}
