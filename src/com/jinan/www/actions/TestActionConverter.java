package com.jinan.www.actions;

import com.jinan.www.entity.Student;
import com.opensymphony.xwork2.ActionSupport;

public class TestActionConverter extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Student testp;
	
	public Student getTestp() {
		return testp;
	}

	public void setTestp(Student testp) {
		this.testp = testp;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(testp.getName());
		System.out.println(testp.getAge());
			return SUCCESS;
	}
	

}
