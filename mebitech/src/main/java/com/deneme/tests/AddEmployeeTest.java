package com.deneme.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.validation.BindingResult;

import com.deneme.controller.MebiController;
import com.deneme.entity.Department;
import com.deneme.entity.Employee;

public class AddEmployeeTest {

	@Test
	public void test() {
		MebiController mebiController=new MebiController();
		Employee employee= new Employee();
		Department department =new Department();
		department.setName("Üretim");
		department.setDescription("Üretim Planlama");
		employee.setName("Merve");
		employee.setSurName("ES");
		employee.setSalary(5000l);
		employee.setDepartment(department);
		BindingResult bindingResult = null;
		String a = mebiController.addEmployee(employee, bindingResult);
		assertEquals("redirect:/", a);
		
	}

}
