<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="<%=path %>/css/Common.css" rel="stylesheet" type="text/css" />
    <link href="<%=path %>/css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="<%=path %>/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript">
       function check1()
       {
         
          
          document.form1.submit();
       }
    </script>
  </head>
  
  <body>
		<div class="NewContainer770">
			<div class="BoxHeader">
				<div class="BoxHeader-center MarginTop10">Add User</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/userAdd.action" name="form1" method="post">
				     <table align="left" border="0">
					        <tr>
					             <td align="center">Username:</td>
					             <td><input type="text" name="userName" id="userName"/></td>
					        </tr>
					        <tr>
					             <td align="center">User Type:</td>
					             <td>
					                 <select name="userType">
					                     <option value="1">Trainer</option>
					                     <option value="2">Customer Services</option>
					                     <option value="3">Salesperson</option>
					                     <option value="4">Cleaning</option>
					                 </select>
                                 </td>
					        </tr>
					        <tr>
					             <td align="center">Address:</td>
					             <td><input type="text" name="userAddress"/></td>
					        </tr>
					        <tr>
					             <td align="center">Gender:</td>
					             <td><input type="text" name="userSex"/></td>
					        </tr>
					        <tr>
					             <td align="center">Contact:</td>
					             <td><input type="text" name="userTel"/></td>
					        </tr>
					        <tr>
					             <td align="center">email:</td>
					             <td><input type="text" name="userEmail"/></td>
					        </tr>
					        <tr>
					             <td align="center">Mobile:</td>
					             <td><input type="text" name="userQq"/></td>
					        </tr>
					        <tr>
					             <td colspan="2">
					                 <input type="submit" value="Save"/>
					                 <input  type="reset" value="Cancel"/>
					                 <font color="red"></font>
					             </td>
					        </tr>
					        <tr height="30">
					        </tr>
					    </table>
				</form>
				<ul>
					<li><a href="" title="">&nbsp;</a> </li>
					<li><a href="" title="">&nbsp;</a> </li>
				</ul>
			</div>
        </div>
  </body>
</html>
