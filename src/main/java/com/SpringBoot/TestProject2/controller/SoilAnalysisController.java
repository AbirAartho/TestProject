package com.SpringBoot.TestProject2.controller;

import com.SpringBoot.TestProject2.entity.Sample4;
import com.SpringBoot.TestProject2.service.SampleService4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/soilanalysis")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class SoilAnalysisController {
    @Autowired
    public SampleService4 sampleService4;

    @PostMapping("/add")
    public Sample4 addData(@RequestBody Sample4 sample4) {
        return sampleService4.save(sample4);
    }

    @GetMapping("/{id5}")
    public Sample4 getDataById(@PathVariable("id5") Long id5) {
        return sampleService4.getDataById(id5);
    }
    @GetMapping
    public List<Sample4> getAll() {
        return sampleService4.getData();
    }
    @PutMapping("/update")
    public Sample4 update(@RequestBody Sample4 sample4) {
        return sampleService4.save(sample4);
    }

    @DeleteMapping("/{id5}")
    public void delete(@PathVariable("id5") Long id5) {
        sampleService4.delete(id5);
    }
}
