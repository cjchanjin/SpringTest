<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>회원 정보</h1>
		<div>
			ID: ${view.id }<br />
			NAME: ${view.name }<br />
			PW: ${view.pw }<br />
			TEL: ${view.tel }<br />
			addr: ${view.addr }<br />
			gender: ${view.gender }<br />
			hobby: ${view.hobby }<br />
			fileName: ${view.fileName }<br />
			auth: ${view.auth }<br />
			
		</div>
		<div><br />
			<a href="memberList.do">회원목록</a> &nbsp;&nbsp;
			<a href="#">정보수정</a>	&nbsp;&nbsp;
			<a href="memberDelete.do">회원삭제</a>
		</div>
	</div>
</body>
</html>