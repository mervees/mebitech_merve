package com.deneme.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.validation.BindingResult;

import com.deneme.controller.MebiController;
import com.deneme.entity.Department;

public class DeleteDepartmentClass {

	@Test
	public void test() {
		MebiController mebiController=new MebiController();
		Department department =new Department();
		department.setName("Üretim");
		department.setDescription("Üretim Planlama");
		BindingResult bindingResult = null;
		String a = mebiController.deleteDepartment(department.getId());
		assertEquals("redirect:/", a);
		
	}
}
