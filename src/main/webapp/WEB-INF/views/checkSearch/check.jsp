<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<form id="frm" name="frm" action="checkList.do" method="post">
	<label for="helperWorkArea">근무지역</label>
		<select name="helperWorkArea" id="helperWorkArea">
			<option value="">선택안함</option>
			<option value="daegue">대구</option>
			<option value="kyungbook">경북</option>
		</select>
		
	<label for="helperStartTime">돌봄시작시간</label>
		<select name="helperStartTime" id="helperStartTime">
			<option value="">선택안함</option>
			<option value="00">00</option>
			<option value="01">01</option>
		</select>	
	
	<label for="helperEndTime">돌봄종료시간</label>
		<select name="helperEndTime" id="helperEndTime">
			<option value="">선택안함</option>
			<option value="02">02</option>
			<option value="03">03</option>
		</select>
	<br><br>
	<input type="submit" value="SUBMIT" id="sbmt" name="sbmt">	
</form>


</body>
</html>