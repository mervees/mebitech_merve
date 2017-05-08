package com.deneme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deneme.entity.Department;
import com.deneme.entity.Employee;
import com.deneme.entity.Meeting;
import com.deneme.service.DepartmentService;
import com.deneme.service.EmployeeService;
import com.deneme.service.MeetingService;

@Controller
public class MebiController {

	@Autowired
	EmployeeService es;

	@RequestMapping("/")
	public String listEmployees(Model model) {
		model.addAttribute("employee", new Employee());
		model.addAttribute("employeeList", es.getir());
		return "indexemployee";
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
		es.Kaydet(employee);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete/{id}", method = { RequestMethod.POST, RequestMethod.GET })
	public String deleteEmployee(@PathVariable Long id) {
		es.sil(es.getirByID(id));
		return "redirect:/";
	}

	@RequestMapping(value = "/update/{id}", method = { RequestMethod.POST, RequestMethod.GET })
	public String updateEmployee(@PathVariable Long id, Model model) {
		model.addAttribute("employee", es.getirByID(id));
		return "redirect:/";
	}
	
	@Autowired
	DepartmentService ds;

	@RequestMapping("/listdepartments")
	public String listDepartments(Model model) {
		model.addAttribute("department", new Department());
		model.addAttribute("departmentList", ds.getir());
		return "indexdepartment";
	}

	@RequestMapping(value = "/department", method = RequestMethod.POST)
	public String addDepartment(@ModelAttribute("department") Department department, BindingResult bindingResult) {
		ds.Kaydet(department);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete/{id}", method = { RequestMethod.POST, RequestMethod.GET })
	public String deleteDepartment(@PathVariable Long id) {
		ds.sil(ds.getirByID(id));
		return "redirect:/";
	}

	@RequestMapping(value = "/update/{id}", method = { RequestMethod.POST, RequestMethod.GET })
	public String updateDepartment(@PathVariable Long id, Model model) {
		model.addAttribute("department", ds.getirByID(id));
		return "redirect:/";
	}
	
	@Autowired
	MeetingService ms;

	@RequestMapping("/listmeetings")
	public String listMeetings(Model model) {
		model.addAttribute("meeting", new Meeting());
		model.addAttribute("meetingList", ms.getir());
		return "indexmeeting";
	}

	@RequestMapping(value = "/meeting", method = RequestMethod.POST)
	public String addMeeting(@ModelAttribute("meeting") Meeting meeting, BindingResult bindingResult) {
		ms.Kaydet(meeting);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete/{id}", method = { RequestMethod.POST, RequestMethod.GET })
	public String deleteMeeting(@PathVariable Long id) {
		ms.sil(ms.getirByID(id));
		return "redirect:/";
	}

	@RequestMapping(value = "/update/{id}", method = { RequestMethod.POST, RequestMethod.GET })
	public String updateMeeting(@PathVariable Long id, Model model) {
		model.addAttribute("meeting", ms.getirByID(id));
		return "redirect:/";
	}


}
