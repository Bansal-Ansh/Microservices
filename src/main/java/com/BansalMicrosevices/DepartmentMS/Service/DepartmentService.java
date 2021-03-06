package com.BansalMicrosevices.DepartmentMS.Service;

import com.BansalMicrosevices.DepartmentMS.Entity.Department;
import com.BansalMicrosevices.DepartmentMS.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
