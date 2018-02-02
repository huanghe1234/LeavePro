package com.tc25.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teaId;
	private String userName;
	private String userPwd;
	private String realName;
	@ManyToOne
	private Job job;
	@OneToMany
	@JoinColumn(name = "teaId")
	private Set<Leaveform> lfs = new HashSet<>();

	// 双向一对多自身关联
	@OneToMany
	@JoinColumn(name = "parent_id")
	private Set<Teacher> teachers = new HashSet<>();
	@ManyToOne
	private Teacher teacher;

	public int getTeaId() {
		return teaId;
	}

	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Set<Leaveform> getLfs() {
		return lfs;
	}

	public void setLfs(Set<Leaveform> lfs) {
		this.lfs = lfs;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Teacher [teaId=" + teaId + ", userName=" + userName + ", userPwd=" + userPwd + ", realName=" + realName
				+ ", job=" + job + ", lfs=" + lfs + ", teachers=" + teachers + ", teacher=" + teacher + "]";
	}

}
