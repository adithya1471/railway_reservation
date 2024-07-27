package com.oasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oasis.entity.Department;
import com.oasis.service.DepartmentService;


@RestController
public class DeptController {
	
	@Autowired
	private DepartmentService deptsimp;
	
	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		return deptsimp.saveDepartment(department);
	}
}
