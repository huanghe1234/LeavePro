package com.tc25.action;

import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ModelDriven;
import com.tc25.HButil.HBUtils;
import com.tc25.entity.Leaveform;

public class LeaveformAction implements ModelDriven<Leaveform>{

	
	private Leaveform lf = new Leaveform();
	private Session session = HBUtils.getSession();
	
	
	public String add(){
		
		System.out.println(lf);
		
		lf.setStatus("新建");
		session.save(lf);
		session.beginTransaction().commit();
		session.close();
		
		return "welcome";
		
	}
	
	
	public String getOne(){
		
		 lf = (Leaveform) session.get(Leaveform.class, lf.getLfId());
		
		return "teacherCheck";
	}
	
	public String agree(){
		 
		lf = (Leaveform) session.get(Leaveform.class, lf.getLfId());
		lf.setStatus("同意");
		session.save(lf);
		session.beginTransaction().commit();
		session.close();
		
		
		return "welcome";
	}
	
	public String reject(){
		lf = (Leaveform) session.get(Leaveform.class, lf.getLfId());
		lf.setStatus("驳回");
		session.save(lf);
		session.beginTransaction().commit();
		session.close();
		
		return "welcome";
		
	}
	
	
	
	@Override
	public Leaveform getModel() {
		
		return lf;
	}


	public Leaveform getLf() {
		return lf;
	}
	
	
	
	
}
