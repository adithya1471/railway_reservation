package com.oasis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasis.entity.Department;
import com.oasis.repo.DeptRepo;
@Service
public class DepartmentServiceImp implements DepartmentService {
	
	@Autowired
	private DeptRepo repo;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return repo.save(department);
	}

}
