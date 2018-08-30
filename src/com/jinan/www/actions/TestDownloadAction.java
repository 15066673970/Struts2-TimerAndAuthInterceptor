package com.jinan.www.actions;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TestDownloadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String inputPath;
	
	public InputStream getTarFile() {
		return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getInputPath() {
		return inputPath;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}
	
	
	

}
