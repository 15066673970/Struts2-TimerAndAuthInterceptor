package com.jinan.www.actions;

import com.jinan.www.entity.Student;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class PConvert extends DefaultTypeConverter {

	@Override
	public Object convertValue(Object value, Class toType) {
		if(toType==Student.class) {
			String[] params = (String[])value;
			Student student= new Student();
			String[] stu1 = params[0].split(",");
			student.setName(stu1[0]);
			student.setAge(Integer.valueOf(stu1[1]));
			return student;
		}
		return null;
		
		
	}
	
	

}
