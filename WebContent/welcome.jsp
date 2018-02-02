<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到请假单界面</title>
	<style>
		.content{
			width:500px;
			height:500px;
			margin: 100px auto;
			border: #f00 3px solid;
		}
		h2{
			text-align:center;
			
		}
		
		.option{
			width:200px;
			height:200px;
			margin: 100px auto;
			
		}
		.left{
			margin-left: 22px ;
		}
		
	</style>
</head>
<body>
	<div class="content">
		<h2>请假单</h2>
		<div class="option">
			<a href="user_check" class="left">学生请假</a>
			<a href="login.jsp" >登陆</a>
			<a href="user_getAllLeave" class="right">教师审批</a>
		</div>
	</div>
</body>
</html>