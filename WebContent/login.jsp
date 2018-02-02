<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
	<style type="text/css">
		.login{
			width:200px;
			height:200px;
			margin: 100px auto;
			border: green 1px solid;
		}
		
		input{
			margin: 5px 10px ;
		}
		select{
			margin: 5px 10px
		}
		
		.regist{
			width:200px;
			height:200px;
			margin: 100px auto;
			border: green 1px solid;
		}
		.center{
			margin-left:75px;
		
		}
	</style>	
</head>
<body>
	<div class="login">
		<form action="user_login">
		<input type="text" placeholder="请输入用户名" name="userName"><br/>
		<input type="password" placeholder="请输入密码" name="userPwd"><br/>
		<input type="submit" value="登陆" class="center">
		</form>
		<p>${tip}</p>
	</div>
	
	<div class="regist">
		<form action="user_regist">
		<input type="text" placeholder="请输入用户名" name="userName"><br/>
		<input type="password" placeholder="请输入密码" name="userPwd"><br/>
		<input type="text" placeholder="请输入真实名称" name="realName"><br/>
		<select name="job.jobName">
			<option value="学生" >学生<option>
			<option value="老师" >老师<option>
			<option value="管理员" >管理员<option>
		</select><br/>
		<input type="text" value="十八般武艺都会的老师" name="teacher.userName"><br/>
		<input type="submit" value="注册" class="center">
		</form>
	</div>
</body>
</html>