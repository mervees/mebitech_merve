package com.deneme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deneme.entity.Employee;
import com.deneme.repostory.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo er;

	public void Kaydet(Employee e) {
		er.save(e);
	}

	public void sil(Employee e) {
		er.delete(e);
	}

	public List<Employee> getir() {
		return (List<Employee>) er.findAll();
	}

	public Employee getirByID(Long id) {
		return er.findEmployeeById(id);
	}

}
