package com.SpringBoot.TestProject2.controller;

import com.SpringBoot.TestProject2.dto.SampleDto;
import com.SpringBoot.TestProject2.entity.Sample;
import com.SpringBoot.TestProject2.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/sample")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class SampleController {
    @Autowired
    public SampleService sampleService;

    @PostMapping("/add")
    public Sample addData(@RequestBody Sample sample) {
        return sampleService.save(sample);
    }

    @GetMapping("/{id2}")
    public Sample getDataById(@PathVariable("id2") Long id2) {
        return sampleService.getDataById(id2);
    }
    @GetMapping
    public List<Sample> getAll() {
        return sampleService.getData();
    }
    @PutMapping("/update")
    public Sample update(@RequestBody Sample sample) {
        return sampleService.save(sample);
    }

    @DeleteMapping("/{id2}")
    public void delete(@PathVariable("id2") Long id2) {
        sampleService.delete(id2);
    }

    @GetMapping("/search")
    public List<SampleDto> searchByDate(@RequestParam(value = "startDate", required = false) String startDate,
                                        @RequestParam(value = "endDate", required = false) String endDate) {
        if (startDate.equals("undefined") && endDate.equals("undefined")){
            LocalDate now = LocalDate.now();
            LocalDate earlier = now.minusMonths(1);
            return sampleService.getDataByDate(String.valueOf(earlier), String.valueOf(now));
        }
        return sampleService.getDataByDate(startDate, endDate);

    }
}
