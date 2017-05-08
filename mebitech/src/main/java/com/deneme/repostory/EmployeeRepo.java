package com.deneme.repostory;

import org.springframework.data.repository.CrudRepository;

import com.deneme.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

	Employee findEmployeeById(Long id);
}
