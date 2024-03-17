package com.SpringBoot.TestProject2.controller;

import com.SpringBoot.TestProject2.entity.LabAnalyst;
import com.SpringBoot.TestProject2.service.LabAnalystService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/v1/api/labAnalyst", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class LabAnalystController {
    @Autowired
    public LabAnalystService labAnalystService;

    @PostMapping("/add")
    public LabAnalyst addData(@RequestBody LabAnalyst labAnalyst) {
        return labAnalystService.save(labAnalyst);
    }

    @GetMapping("/{id}")
    public LabAnalyst getDataById(@PathVariable("id") Long id) {
        return labAnalystService.getDataById(id);
    }

    @PutMapping("/update")
    public LabAnalyst update(@RequestBody LabAnalyst labAnalyst) {
        return labAnalystService.save(labAnalyst);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        labAnalystService.delete(id);
    }
}
