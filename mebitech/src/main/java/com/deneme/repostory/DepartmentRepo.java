package com.deneme.repostory;

import org.springframework.data.repository.CrudRepository;

import com.deneme.entity.Department;
import com.deneme.entity.Meeting;

public interface DepartmentRepo extends CrudRepository<Department, Long>{

	Department findDepartmentById(Long id);
}
