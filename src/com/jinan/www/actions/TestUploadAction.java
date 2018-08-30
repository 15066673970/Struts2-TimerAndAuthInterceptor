package com.jinan.www.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.opensymphony.xwork2.ActionSupport;

public class TestUploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//封装的上传文件的文件内容
	private File ufile;
	//封装的上传文件文件名
	private String ufileFileName;
	//封装的上传文件的文件类型
	private String ufileContentType;
	
	
	
	
	@Override
	public String execute() throws Exception {
		
		FileInputStream fInputStream = new FileInputStream(ufile);
		FileOutputStream fileOutputStream =new FileOutputStream("G:\\testfileload\\"+ufileFileName);
		byte[] buffer = new byte[1024];
		int len;
		while((len=fInputStream.read(buffer))>0) {
			fileOutputStream.write(buffer,0, len);
		}
		System.out.println("文件已经上传至本地g://testfileload//");
		return SUCCESS;
		
		
		
	}




	public File getUfile() {
		return ufile;
	}




	public void setUfile(File ufile) {
		this.ufile = ufile;
	}








	public String getUfileFileName() {
		return ufileFileName;
	}




	public void setUfileFileName(String ufileFileName) {
		this.ufileFileName = ufileFileName;
	}




	public String getUfileContentType() {
		return ufileContentType;
	}




	public void setUfileContentType(String ufileContentType) {
		this.ufileContentType = ufileContentType;
	}
	
	
	

}
