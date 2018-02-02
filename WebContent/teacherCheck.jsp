<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师审批界面</title>
	<style type="text/css">
		div{
			width:400px;
			height:400px;
			margin: 100px auto;
			border: green 1px solid;
		}
	</style>	
</head>
<body>
	<div>
		<h2>老师审批</h2>
		请假人:${lf.asker.userName }<br/>
		请假类型:${lf.type }<br/>
		开始时间:${lf.startDate }<br/>
		结束时间:${lf.endDate }<br/>
		请假事由:${lf.reason }<br/>
		<a href="leave_agree?lfId=${lf.lfId }">同意请假</a><br/>
		<a href="leave_reject?lfId=${lf.lfId }">请假驳回</a><br/>
	</div>
</body>
</html>