package com.SpringBoot.TestProject2.service;

import com.SpringBoot.TestProject2.entity.LabAnalyst;
import com.SpringBoot.TestProject2.repository.LabAnalystRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabAnalystService {
    @Autowired
    public LabAnalystRepo labAnalystRepo;

    public List<LabAnalyst> getData() {
        return labAnalystRepo.findAll();
    }
    public LabAnalyst save(LabAnalyst labAnalyst) {
        return labAnalystRepo.save(labAnalyst);
    }
    public LabAnalyst getDataById(Long id) {
        return labAnalystRepo.findById(id).get();
    }
    public LabAnalyst update(Long id, LabAnalyst labAnalyst) {
        labAnalyst.setId(id);
        return labAnalystRepo.save(labAnalyst);
    }
    public void delete(Long id) {
        labAnalystRepo.deleteById(id);
    }
}
