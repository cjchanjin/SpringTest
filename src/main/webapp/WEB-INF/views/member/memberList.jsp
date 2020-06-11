<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#listDiv {
		width: 300px;
	}
</style>
<script type="text/javascript">
	function selectOne(key) {
		document.frm.mId.value=key;
		console.log(key);
		document.frm.submit();
	}
</script>
</head>
<body>
	<div align="center">
		<h1>회 원 목 록</h1>
		<div>
			<c:forEach var="list" items="${list }">
				<div id="listDiv" onclick="selectOne('${list.id }')" 
				onMouseOver="this.style.backgroundColor='silver';" onMouseOut="this.style.backgroundColor='';">
					ID: ${list.id } &nbsp;&nbsp;
					Name: ${list.name } <br />
				</div>
			</c:forEach>
		</div>
		<div><br />
			<a href="main.do">메인</a>
		</div>
	</div>
	<form id="frm" name="frm" action="memberInfo.do" method="post">
		<input type="hidden" id="mId" name="mId">
	</form>
	
</body>
</html>