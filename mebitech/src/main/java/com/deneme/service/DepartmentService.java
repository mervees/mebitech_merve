package com.deneme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deneme.entity.Department;
import com.deneme.entity.Employee;
import com.deneme.repostory.DepartmentRepo;
import com.deneme.repostory.EmployeeRepo;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepo dr;

	public void Kaydet(Department d) {
		dr.save(d);
	}

	public void sil(Department d) {
		dr.delete(d);
	}

	public List<Department> getir() {
		return (List<Department>) dr.findAll();
	}

	public Department getirByID(Long id) {
		return dr.findDepartmentById(id);
	}
}
