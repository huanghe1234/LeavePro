<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生请假界面</title>
	<style type="text/css">
		
		form{
			width:400px;
			height:400px;
			margin: 100px auto;
			border: green 1px solid;
		}
		.listStu{
			width:400px;
			margin: 100px auto;
			
		}
		
		input{
			margin-bottom: 15px ;
		}
		
		span{
			padding:5px 10px;
		
		}
		
		.stuView{
			margin: 50px 75px;
		}
		.submit{
			margin-top: 15px;
			margin-left: 90px ;
		}
	</style>
</head>
<body>
		<form action="leave_add">
			<div class="stuView">
				<h2>学生请假</h2>
				<span>请假人</span><input value="${u.userName }" ><br/>
					<input type="hidden" value="${u.userId }" name="asker.userId">
				<span>审批人</span><input value="${u.teacher.realName }" ><br/>
					<input type="hidden" value="${u.teacher.teaId }" name="teacher.teaId">
				<span>请假类型</span><select name="type">
					<option value="病假">病假</option>
					<option value="事假">事假</option>
					<option value="婚假">婚假</option>
					<option value="外出">外出</option>
				</select><br/>
				<span>开始时间</span><input  type="date" value="" name="startDate"><br/>
				<span>结束时间</span><input type="date" value="" name="endDate"><br/>
				<span>请假事由</span><textarea rows="" cols="" name="reason"></textarea><br/>
				<input type="submit" value="提交" class="submit">
			</div>
		</form>
		<div class="listStu">
			<c:forEach items="${listStu}" var="temp">
			
					请假人:${temp.asker.userName }<br/>
					请假类型:${temp.type }<br/>
					开始时间:${temp.startDate }<br/>
					结束时间:${temp.endDate }<br/>
					请假事由:${temp.reason }<br/>	
					状态:${temp.status }<br/>
					<hr/>	
						
			</c:forEach>
		</div>
		
</body>
</html>