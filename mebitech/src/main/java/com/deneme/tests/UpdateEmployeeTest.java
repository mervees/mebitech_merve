package com.deneme.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.validation.BindingResult;
import org.springframework.ui.Model;
import com.deneme.controller.MebiController;
import com.deneme.entity.Department;
import com.deneme.entity.Employee;

public class UpdateEmployeeTest {

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
		Model model = null;
		String a = mebiController.updateEmployee(employee.getId(), model);
		assertEquals("redirect:/", a);
		
	}

}
