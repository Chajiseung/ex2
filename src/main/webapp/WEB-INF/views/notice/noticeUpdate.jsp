<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>NOTICEUPDATE</h2>
	<form action="./noticeUpdate" method="post">
		<input type="hidden" name="num" value="${dto.num}">
		Writer : <p><input type="text" name="writer" value="${dto.writer}"></p>
		Title : <p><input type="text" name="title" value="${dto.title}"></p>
		contents: <p><input type="text" name="contents" value="${dto.contents}"></p>
		
		<button>Update</button>
		
	</form>
</body>
</html>