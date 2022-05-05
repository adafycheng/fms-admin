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
    <script type='text/javascript' src='<%=path %>/dwr/interface/cardService.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
    <script type="text/javascript">
       function check1()
       {
         
          
          document.form1.submit();
       }
       
       function init()
        {
           cardService.findAllCard(callBack)
        }
        
        function callBack(data)
        {
            DWRUtil.addOptions("userOne1",data,"cardLeixiong","cardLeixiong");
        }
    </script>
  </head>
  
  <body onload="init()">
		<div class="NewContainer770">
			<div class="BoxHeader">
				<div class="BoxHeader-center MarginTop10">录入搜索</div>
			</div>
			<div class="Slot">
				<form action="<%=path %>/huiyuanSearch.action" name="form1" method="post">
				     <table align="left" border="0">
					        <tr>
					             <td align="center">姓名:</td>
					             <td><input type="text" name="userName" id="userName"/></td>
					        </tr>
					        
					        <tr>
					             <td colspan="2">
					                 <input type="submit" value="确定"/>
					                 <input  type="reset" value="取消"/>
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
