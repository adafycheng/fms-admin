<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <style type="text/css">
		    body {
			margin-left: 0px;
			margin-top: 0px;
			margin-right: 0px;
			margin-bottom: 0px;
		}
		.STYLE1 {
			font-size: 12px;
			color: #000000;
		}
		.STYLE5 {font-size: 12}
		.STYLE7 {font-size: 12px; color: #FFFFFF; }
    </style>
		<script language="javascript">
			function calender()
			{
				 var time=new Date();
				 var year=time.getYear();
				 var month=time.getMonth()+1;
				 var day=time.getDate();
				 var hour=time.getHours();
				 var minute=time.getMinutes();
				 var second=time.getSeconds();
				 if(minute<10)
				 {
				  minute="0"+minute;
				 }
				 if(second<10)
				 {
				  second="0"+second;
				 }
				 document.myform.date.value=year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
				 var mytime=setTimeout("calender()",1000);
			}
			</script>
  </head>
  
  <body onload="calender()">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="57" background="<%=path %>/images/main_03.gif">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							
							<td style="FONT-WEIGHT: bold; FONT-SIZE: 23pt; FILTER: Glow(Color=#00347F,Strength=4); WIDTH: 100%; COLOR: #ffffff">
							     &nbsp;&nbsp;Fitness Management System
							</td>
							<td width="281" valign="bottom">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="33" height="27">
											
										</td>
										<td width="248" background="<%=path %>/images/main_06.gif">
											<table width="225" border="0" align="center" cellpadding="0"
												cellspacing="0">
												<tr>
													<td height="17">
														<div align="right">
															<!--<img src="<%=path %>/images/pass.gif" width="69" height="17" />-->
														</div>
													</td>
													<td>
														<div align="right">
															<!--<img src="<%=path %>/images/user.gif" width="69" height="17" />-->
														</div>
													</td>
													<td>
														<div align="right">
															<input type="image" src="<%=path %>/images/quit.gif" width="70" onclick="javascript:parent.location='<%=path %>/admin/logout.jsp';" />
															
														</div>
													</td>
												</tr>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td height="40" background="<%=path %>/images/main_10.gif">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="194" height="40" background="<%=path %>/images/main_07.gif">&nbsp;
								
							</td>
							<td>
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="21">
											<img src="<%=path %>/images/main_13.gif" width="19" height="14" />
										</td>
										<td width="35" class="STYLE7">
											<div align="center">
												Home
											</div>
										</td>
										<td width="21" class="STYLE7">
											<img src="<%=path %>/images/main_15.gif" width="19" height="14" />
										</td>
										<td width="35" class="STYLE7">
											<div align="center">
												Backpage
											</div>
										</td>
										<td width="21" class="STYLE7">
											<img src="<%=path %>/images/main_17.gif" width="19" height="14" />
										</td>
										<td width="35" class="STYLE7">
											<div align="center">
												Nextpage
											</div>
										</td>
										<td width="21" class="STYLE7">
											<img src="<%=path %>/images/main_19.gif" width="19" height="14" />
										</td>
										<td width="35" class="STYLE7">
											<div align="center">
												Refresh
											</div>
										</td>
										<td width="21" class="STYLE7">
											<img src="<%=path %>/images/main_21.gif" width="19" height="14" />
										</td>
										<td width="35" class="STYLE7">
											<div align="center">
												Help
											</div>
										</td>
										<td>&nbsp;
											
										</td>
									</tr>
								</table>
							</td>
							<td width="248">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="16%">
											<span class="STYLE5"></span>
										</td>
										<td width="75%">
											<div align="center">
												<span class="STYLE7"><form name="myform" style="margin:0px;">
														Time:
														<input type="text" name="date" value="" size="15"
															style="height:15px; width:100px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;" />
													</form>
												</span>
											</div>
										</td>
										<td width="9%">&nbsp;
											
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td height="30" background="<%=path %>/images/main_31.gif">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="8" height="30">
								<img src="<%=path %>/images/main_28.gif" width="8" height="30" />
							</td>
							<td width="147" background="<%=path %>/images/main_29.gif">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="24%">&nbsp;
											
										</td>
										<td width="43%" height="20" valign="bottom" class="STYLE1">
											Menu
										</td>
										<td width="33%">&nbsp;
											
										</td>
									</tr>
								</table>
							</td>
							<td width="39">
								<img src="<%=path %>/images/main_30.gif" width="39" height="30" />
							</td>
							<td>
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td height="20" valign="bottom">
											<span class="STYLE1">Username: <s:property value="#session.user.userName"/></span>
										</td>
										<td valign="bottom" class="STYLE1">
											
										</td>
									</tr>
								</table>
							</td>
							<td width="17">
								<img src="<%=path %>/images/main_32.gif" width="17" height="30" />
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
