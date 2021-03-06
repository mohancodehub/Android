package com.ids.database.model;

import java.util.Date;



public class OfficeHours {
	private Integer office_id;
	private Date start_time;
	private Date end_time;
	private Integer instructor_id;
	private String office_day;
	
	
	
	public String getOffice_day() {
		return office_day;
	}
	public void setOffice_day(String office_day) {
		this.office_day = office_day;
	}
	public Integer getOffice_id() {
		return office_id;
	}
	public void setOffice_id(Integer office_id) {
		this.office_id = office_id;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public Integer getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(Integer instructor_id) {
		this.instructor_id = instructor_id;
	}
	
	public OfficeHours(Date start_time, Date end_time) {
		super();

		this.start_time = start_time;
		this.end_time = end_time;

	}
	
	public OfficeHours() {
	}
	
}
