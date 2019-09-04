<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 관리 시스템</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h2>학생부 등록</h2>
	<form action=""></form>
	
	<form id = "login_form" action = "<%=request.getContextPath()%>/student.do?action=register">
		이름 : <input type = "text"  name = "name"/><br/>
		주민번호 : <input type = "text"  name = "ssn"/><br/>
		국어점수 : <input type = "text"  name = "kor"/><br/>
		영어점수 : <input type = "text"  name = "eng"/><br/>
		수학점수 : <input type = "text"  name = "math"/><br/>
		사회점수 : <input type = "text"  name = "society"/><br/>
		<input type = "submit" id = "btn" value = "전송">
	</form>
</div>
<script>

$('#login_form').submit(function(){
	alert('테스트 맥락 5 !!');
});
</script>
</body>
</html>