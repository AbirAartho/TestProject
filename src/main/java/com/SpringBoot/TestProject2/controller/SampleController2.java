package com.SpringBoot.TestProject2.controller;

import com.SpringBoot.TestProject2.dto.SampleDto2;
import com.SpringBoot.TestProject2.entity.Sample2;
import com.SpringBoot.TestProject2.service.SampleService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/v1/api/sample2")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class SampleController2 {
    @Autowired
    public SampleService2 sampleService2;

    @PostMapping("/add")
    public Sample2 addData(@RequestBody Sample2 sample2) {
        return sampleService2.save(sample2);
    }

    @GetMapping("/{id3}")
    public Sample2 getDataById(@PathVariable("id3") Long id3) {
        return sampleService2.getDataById(id3);
    }
    @GetMapping
    public List<Sample2> getAll() {
        return sampleService2.getData();
    }
    @PutMapping("/update")
    public Sample2 update(@RequestBody Sample2 sample2) {
        return sampleService2.save(sample2);
    }

    @DeleteMapping("/{id3}")
    public void delete(@PathVariable("id3") Long id3) {
        sampleService2.delete(id3);
    }

    @GetMapping("/search")
    public List<SampleDto2> searchByDate(@RequestParam(value = "startDate", required = false) String startDate,
                                         @RequestParam(value = "endDate", required = false) String endDate) {
        if (startDate.equals("undefined") && endDate.equals("undefined")){
            LocalDate now = LocalDate.now();
            LocalDate earlier = now.minusMonths(1);
            return sampleService2.getDataByDate(String.valueOf(earlier), String.valueOf(now));
        }
        return sampleService2.getDataByDate(startDate, endDate);

    }
}
