<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请假单列表界面</title>
	<style type="text/css">
		 a:link, a:visited{
            text-decoration: none;
            color: chocolate;
        }
         a:hover, a:active{
            text-decoration: underline;
            color: blue;
        }
	
	</style>

</head>
<body>
<h2>请假人列表</h2>
		<c:forEach items="${list}" var="temp">			
				 编号:${temp.lfId}:<a href="leave_getOne?lfId=${temp.lfId}">请假人:${temp.asker.userName}
				 		&nbsp; &nbsp;&nbsp; &nbsp;开始时间:${temp.startDate }&nbsp; &nbsp;&nbsp; &nbsp;结束时间:${temp.endDate }
				 </a><br/>
		</c:forEach>
</body>
</html>