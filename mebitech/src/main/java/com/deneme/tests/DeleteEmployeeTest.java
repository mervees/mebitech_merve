package com.deneme.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.validation.BindingResult;

import com.deneme.controller.MebiController;
import com.deneme.entity.Department;
import com.deneme.entity.Employee;

public class DeleteEmployeeTest {

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
		String a = mebiController.deleteEmployee(employee.getId());
		assertEquals("redirect:/", a);
		
	}

}
