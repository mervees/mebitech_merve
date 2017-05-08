package com.deneme.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.deneme.controller.MebiController;
import com.deneme.entity.Department;

public class UpdateDepartmentTest {

	@Test
	public void test() {
		MebiController mebiController=new MebiController();
		Department department =new Department();
		department.setName("Üretim");
		department.setDescription("Üretim Planlama");
		BindingResult bindingResult = null;
		Model model = null;
		String a = mebiController.updateDepartment(department.getId(), model);
		assertEquals("redirect:/", a);
		
	}
}
