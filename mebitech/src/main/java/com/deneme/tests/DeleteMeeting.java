package com.deneme.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.deneme.controller.MebiController;
import com.deneme.entity.Department;
import com.deneme.entity.Meeting;

public class DeleteMeeting {

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
		String a = mebiController.deleteMeeting(meeting.getId());
		assertEquals("redirect:/", a);
		
	}
}
