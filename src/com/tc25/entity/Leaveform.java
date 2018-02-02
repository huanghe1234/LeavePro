package com.tc25.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_leaveform")
public class Leaveform {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int lfId;
	@ManyToOne
	private User asker;
	@ManyToOne
	private Teacher teacher;
	private String type;
	private Date startDate;
	private Date endDate;
	private String reason;
	private String status;
	public int getLfId() {
		return lfId;
	}
	public void setLfId(int lfId) {
		this.lfId = lfId;
	}
	public User getAsker() {
		return asker;
	}
	public void setAsker(User asker) {
		this.asker = asker;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Leaveform() {
		super();
	}
	@Override
	public String toString() {
		return "Leaveform [lfId=" + lfId + ", asker=" + asker + ", teacher=" + teacher + ", type=" + type
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", reason=" + reason + ", status=" + status
				+ "]";
	}
	
	
	
}
