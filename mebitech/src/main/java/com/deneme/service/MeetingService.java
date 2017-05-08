package com.deneme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deneme.entity.Department;
import com.deneme.entity.Meeting;
import com.deneme.repostory.DepartmentRepo;
import com.deneme.repostory.MeetingRepo;

@Service
public class MeetingService {

	@Autowired
	MeetingRepo mr;

	public void Kaydet(Meeting m) {
		mr.save(m);
	}

	public void sil(Meeting m) {
		mr.delete(m);
	}

	public List<Meeting> getir() {
		return (List<Meeting>) mr.findAll();
	}

	public Meeting getirByID(Long id) {
		return mr.findMeetingById(id);
	}
}
