package com.SpringBoot.TestProject2.service;

import com.SpringBoot.TestProject2.dto.SampleDto3;
import com.SpringBoot.TestProject2.entity.Sample2;
import com.SpringBoot.TestProject2.entity.Sample3;
import com.SpringBoot.TestProject2.repository.SampleRepo2;
import com.SpringBoot.TestProject2.repository.SampleRepo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleService3 {
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

    public List<SampleDto3> getDataByDate(String startDate, String endDate) {
        List<SampleDto3> sample3s = new ArrayList<>();
        for (Object[] ob :sampleRepo3.getDataByDate(startDate, endDate)
             ) {
            SampleDto3 sampleDto3 = new SampleDto3();
            sampleDto3.setInputLocation( ob[0]!=null? String.valueOf(ob[0]) : "");
            sampleDto3.setInputCEC( ob[1]!=null? String.valueOf(ob[1]) : "");
            sampleDto3.setInputCa( ob[2]!=null? String.valueOf(ob[2]) : "");
            sampleDto3.setInputCu( ob[3]!=null? String.valueOf(ob[3]) : "");
            sampleDto3.setInputFe( ob[4]!=null? String.valueOf(ob[4]) : "");
            sampleDto3.setInputK( ob[5]!=null? String.valueOf(ob[5]) : "");
            sampleDto3.setInputMg( ob[6]!=null? String.valueOf(ob[6]) : "");
            sampleDto3.setInputMn( ob[7]!=null? String.valueOf(ob[7]) : "");
            sampleDto3.setInputNa( ob[8]!=null? String.valueOf(ob[8]) : "");
            sampleDto3.setInputOM( ob[9]!=null? String.valueOf(ob[9]) : "");
            sampleDto3.setInputP( ob[10]!=null? String.valueOf(ob[10]) : "");
            sampleDto3.setInputS( ob[11]!=null? String.valueOf(ob[11]) : "");
            sampleDto3.setInputZn( ob[12]!=null? String.valueOf(ob[12]) : "");
            sampleDto3.setInputpH( ob[13]!=null? String.valueOf(ob[13]) : "");

            sample3s.add(sampleDto3);
        }

        return sample3s;
    }
}
