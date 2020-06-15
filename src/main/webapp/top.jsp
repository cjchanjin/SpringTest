<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> 톱 페이지입니다.</h1>
<ul>
 <li><a href="user/user.jsp">일반 사용자용 페이지로</a></li>
 <li><a href="admin/admin.jsp">관리자 전용 페이지로</a></li>
</ul>
<form action="logout" method="post">
 <button>로그아웃</button>
</form>

</body>
</html>