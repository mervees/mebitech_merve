package com.deneme.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.deneme.controller.MebiController;
import com.deneme.entity.Department;
import com.deneme.entity.Meeting;

public class UpdateMeetingTest {

	@Test
	public void test() {
		MebiController mebiController=new MebiController();
		Meeting meeting=new Meeting();
		Department department =new Department();
		department.setName("Üretim");
		department.setDescription("Üretim Planlama");
		meeting.setName("Ürün Kalitesi");
		meeting.setDescription("ISO:9001");
		meeting.setDepartment(department);
		BindingResult bindingResult = null;
		Model model = null;
		String a = mebiController.updateMeeting(meeting.getId(), model);
		assertEquals("redirect:/", a);
		
	}
}
