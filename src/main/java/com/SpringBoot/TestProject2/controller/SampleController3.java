package com.SpringBoot.TestProject2.controller;

import com.SpringBoot.TestProject2.dto.SampleDto3;
import com.SpringBoot.TestProject2.entity.Sample3;
import com.SpringBoot.TestProject2.service.SampleService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/v1/api/sample3")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class SampleController3 {
    @Autowired
    public SampleService3 sampleService3;

    @PostMapping("/add")
    public Sample3 addData(@RequestBody Sample3 sample3) {
        return sampleService3.save(sample3);
    }

    @GetMapping("/{id4}")
    public Sample3 getDataById(@PathVariable("id4") Long id4) {
        return sampleService3.getDataById(id4);
    }
    @GetMapping
    public List<Sample3> getAll() {
        return sampleService3.getData();
    }

    @PutMapping("/update")
    public Sample3 update(@RequestBody Sample3 sample3) {
        return sampleService3.save(sample3);
    }

    @DeleteMapping("/{id4}")
    public void delete(@PathVariable("id4") Long id4) {
        sampleService3.delete(id4);
    }


    @GetMapping("/search")
    public List<SampleDto3> searchByDate(@RequestParam(value = "startDate", required = false) String startDate,
                                         @RequestParam(value = "endDate", required = false) String endDate) {
        if (startDate.equals("undefined") && endDate.equals("undefined")){
            LocalDate now = LocalDate.now();
            LocalDate earlier = now.minusMonths(1);
            return sampleService3.getDataByDate(String.valueOf(earlier), String.valueOf(now));
        }
        return sampleService3.getDataByDate(startDate, endDate);

    }
}
