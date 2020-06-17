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

<div align="center">
	<form id="frm" name="frm" action="helperList.do" method="post">
		<label for="helperWorkArea">근무지역</label>
			<select name="helperWorkArea" id="helperWorkArea">
				<option value="">선택안함</option>
				<option value="대구">대구</option>
				<option value="서울">서울</option>
				<option value="인천">인천</option>
				<option value="부산">부산</option>
				<option value="경북">경북</option>
				<option value="경남">경남</option>
			</select>
			
		<label for="helperStartTime">돌봄시작시간</label>
			<select name="helperStartTime" id="helperStartTime">
				<option value="">선택안함</option>
				<option value="0">00</option>
				<option value="1">01</option>
				<option value="2">02</option>
				<option value="3">03</option>
				<option value="4">04</option>
				<option value="5">05</option>
				<option value="6">06</option>
				<option value="7">07</option>
				<option value="8">08</option>
				<option value="9">09</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
				<option value="13">13</option>
				<option value="14">14</option>
				<option value="15">15</option>
				<option value="16">16</option>
				<option value="17">17</option>
				<option value="18">18</option>
				<option value="19">19</option>
				<option value="20">20</option>
				<option value="21">21</option>
				<option value="22">22</option>
				<option value="23">23</option>
				<option value="24">24</option>
				
			</select>	
		
		<label for="helperEndTime">돌봄종료시간</label>
			<select name="helperEndTime" id="helperEndTime">
				<option value="">선택안함</option>
				<option value="0">00</option>
				<option value="1">01</option>
				<option value="2">02</option>
				<option value="3">03</option>
				<option value="4">04</option>
				<option value="5">05</option>
				<option value="6">06</option>
				<option value="7">07</option>
				<option value="8">08</option>
				<option value="9">09</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
				<option value="13">13</option>
				<option value="14">14</option>
				<option value="15">15</option>
				<option value="16">16</option>
				<option value="17">17</option>
				<option value="18">18</option>
				<option value="19">19</option>
				<option value="20">20</option>
				<option value="21">21</option>
				<option value="22">22</option>
				<option value="23">23</option>
				<option value="24">24</option>
			</select>
		<label for="certifiNo">자격증보유</label>
			<input type="checkbox" name="certifiNo" id="certifiNo" value="y">
			
		<br><br>
		<input type="submit" value="SUBMIT" id="sbmt" name="sbmt">	
	</form>
</div>
<div><br/></div>
<div align="center">
	<table border="1">
		<tr>
			<td>프로필</td>
			<td>이름</td>
			<td>근무지역</td>
			<td>돌봄시작시간</td>
			<td>돌봄종료시간</td>
		</tr>
		<c:forEach var="list" items="${searchList }">
		<tr id="listTr" onclick="selectOne('${list.helperNo }')" 
				onMouseOver="this.style.backgroundColor='yellow';" onMouseOut="this.style.backgroundColor='';">
			<td>${list.helperProfile }</td>
			<td>${list.helperName }</td>
			<td>${list.helperWorkArea }</td>
			<td>${list.helperStartTime }</td>
			<td>${list.helperEndTime }</td>		
		</tr>
		</c:forEach>
	</table>
	<div><br />
		<input type="button" name="main" value="메인화면" onclick="location.href='main.do'">
	</div>
	
</div>
	<form id="hiddenFrm" name="hiddenFrm" action="helperInfo.do" method="post">
		<input type="hidden" id="helperNo" name="helperNo">
		
		<!-- 
		<input type="hidden" id="helperStartTime" name="helperStartTime">
		<input type="hidden" id="helperEndTime" name="helperEndTime">
		<input type="hidden" id="helperWorkArea" name="helperWorkArea">
		 -->
		 	
	</form>

	<script type="text/javascript">
		function selectOne(key) {
			
			/*
			document.hiddenFrm.helperStartTime.value = document.frm.helperStartTime.value;
			document.hiddenFrm.helperEndTime.value = document.frm.helperEndTime.value;
			document.hiddenFrm.helperWorkArea.value = document.frm.helperWorkArea.value;
			*/
			
			document.hiddenFrm.helperNo.value=key;
			console.log(key);
			document.hiddenFrm.submit(); 
		}
	</script>

</body>
</html>