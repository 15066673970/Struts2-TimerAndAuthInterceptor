<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% 	request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%> 
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>struts2表单标签-注册页面</title>
</head>
<body>
	<s:form>
		<s:textfield name="username" label="用户名" key="Switch"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:radio list="#{'0':'男','1':'女' }" name="gender" label="性别" value="0"></s:radio>
		<s:select list="#{'bj':'北京','sh':'上海','gz':'广州','jn':'济南' }" label="城市" headerKey="-1"></s:select>
		<s:checkbox name="married" label="是否已婚" value="true" labelposition="left"></s:checkbox>
		<s:checkboxlist list="#{'basketball':'打篮球','code':'写代码','movie':'电影' }" name="hobbies" label="爱好"></s:checkboxlist>
		<s:textarea name="description" label="自我介绍" rows="5" cols="20"></s:textarea>
		<s:file name="photo" label="头像"></s:file>
		<s:submit value="提交"></s:submit>
		<s:reset value="重置"></s:reset>	
	</s:form>
</body>
</html>