<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% 	request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%> 
<!-- <%@ page isELIgnored="true" %> ??????EL??,TRUE????.FALSE?????.JSP2.0??????EL?? 
	<%@ taglib prefix="s" uri="/struts-tags" %> ????struts2??
--> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>文件上传成功</title>
</head>
<body>
文件上传成功
</body>
</html>