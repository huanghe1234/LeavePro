package com.tc25.action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.opensymphony.xwork2.ModelDriven;
import com.tc25.HButil.HBUtils;
import com.tc25.entity.Job;
import com.tc25.entity.Leaveform;
import com.tc25.entity.Teacher;
import com.tc25.entity.User;

public class UserAction implements ModelDriven<User>{

	private User u = new User();
	private String tip;
	private Session session = HBUtils.getSession();
	private Teacher tea = new Teacher(); 
	private List<Leaveform> list = null;
	private List<Leaveform> listStu = null;
	
	public String regist(){
		
		System.out.println(u);
		
		
		//设置角色
		Job j = new Job();
		j.setJobName(u.getJob().getJobName());
		session.save(j);
		//设置老师
		Teacher teacher = new Teacher();
		teacher.setUserName("老师1");
		teacher.setRealName(u.getTeacher().getUserName());
		teacher.setUserPwd("1234");
		session.save(teacher);
		//保存到用户对象中
		u.setJob(j);
		u.setTeacher(teacher);
		session.save(u);
		
		session.beginTransaction().commit();
		session.close();
		
		return "login";
		
	}
	
	
	public String login(){
		
		String hql = "from User where username = ? and userpwd = ?";
		
		Query query = session.createQuery(hql);
		query.setString(0, u.getUserName());
		query.setString(1, u.getUserPwd());
		
		u = (User) query.uniqueResult();
		
		if(u==null){
			tip = "用户名或密码错误!";
			return "login";
		}else{
			String hql2 = "from Leaveform where asker.userId = ? ";
			Query query2 = session.createQuery(hql2);
			query2.setInteger(0, u.getUserId());
			listStu = query2.list();
			
			for (Leaveform leaveform : listStu) {
				System.out.println(leaveform);
			}
			
			return "studentLeave";
		}
	}
	
	public String check(){
		
		if(u.getUserName() == null){
			tip="您还没有登录!";
			return "login";
		}else{
			return "isStudent";
		}
	}
	
	
	public String getAllLeave(){
		
		String hql="from Leaveform where status = '新建'";
		Query query = session.createQuery(hql);
		
		list = query.list();
		
		return "leaveList";
	}
	
	
	
	
	@Override
	public User getModel() {
		return u;
	}


	public User getU() {
		return u;
	}


	public String getTip() {
		return tip;
	}


	public Teacher getTea() {
		return tea;
	}


	public List<Leaveform> getList() {
		return list;
	}


	public List<Leaveform> getListStu() {
		return listStu;
	}
	
	
	
	
	
	
}
