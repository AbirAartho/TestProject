package com.SpringBoot.TestProject2.service;

import com.SpringBoot.TestProject2.entity.Staff;
import com.SpringBoot.TestProject2.repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffService {
    @Autowired
    public StaffRepo staffRepo;

    public List<Staff> getData() {
        return staffRepo.findAll();
    }
    public Staff save(Staff staff) {
        return staffRepo.save(staff);
    }
    public Staff getDataById(Long id) {
        return staffRepo.findById(id).get();
    }
    public Staff update(Long id, Staff staff) {
        staff.setId(id);
        return staffRepo.save(staff);
    }
    public void delete(Long id) {
        staffRepo.deleteById(id);
    }
}
