package com.BansalMicrosevices.DepartmentMS.Controller;

import com.BansalMicrosevices.DepartmentMS.Entity.Department;
import com.BansalMicrosevices.DepartmentMS.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {

        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){

        return departmentService.findDepartmentById(departmentId);

    }
}
