package com.deneme.repostory;

import org.springframework.data.repository.CrudRepository;

import com.deneme.entity.Employee;
import com.deneme.entity.Meeting;

public interface MeetingRepo extends CrudRepository<Meeting, Long>{

	Meeting findMeetingById(Long id);
}
