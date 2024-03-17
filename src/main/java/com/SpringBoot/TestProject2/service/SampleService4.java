package com.SpringBoot.TestProject2.service;

import com.SpringBoot.TestProject2.entity.Sample4;
import com.SpringBoot.TestProject2.repository.SampleRepo4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService4 {
    @Autowired
    public SampleRepo4 sampleRepo4;

    public List<Sample4> getData() {
        return sampleRepo4.findAll();
    }
    public Sample4 save(Sample4 sample4) {
        return sampleRepo4.save(sample4);
    }
    public Sample4 getDataById(Long id5) {
        return sampleRepo4.findById(id5).get();
    }
    public Sample4 update(Long id5, Sample4 sample4) {
        sample4.setId5(id5);
        return sampleRepo4.save(sample4);
    }
    public void delete(Long id5) {
        sampleRepo4.deleteById(id5);
    }
}
