<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	session.setAttribute("admin",null);
	session.invalidate();
	response.sendRedirect("/admin/login.jsp");
%>