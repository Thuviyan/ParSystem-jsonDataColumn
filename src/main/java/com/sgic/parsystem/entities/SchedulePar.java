package com.sgic.parsystem.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sgic.parsystem.converter.AppraisorConvertor;

@Entity
public class SchedulePar {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private User user;
	private Date scheduledate;
	private String venue;
	@Convert(converter = AppraisorConvertor.class)
	private List<String> appraisers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getScheduledate() {
		return scheduledate;
	}

	public void setScheduledate(Date scheduledate) {
		this.scheduledate = scheduledate;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public List<String> getAppraisers() {
		return appraisers;
	}

	public void setAppraisers(List<String> appraisers) {
		this.appraisers = appraisers;
	}



}
