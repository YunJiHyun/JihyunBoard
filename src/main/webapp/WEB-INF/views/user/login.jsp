<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="user_header.jsp" %>
</head>
<body>
	<h1>로그인</h1>
    	<form name="loginForm" method="post" action="${path }/user/loginCheck">
        	<table border="1" width="400px">
            	<tr>
                	<td>아이디</td>
                	<td><input name="userId" id="userId" placeholder="아이디를 입력해주세요"></td>
            	</tr>
            	<tr>
                	<td>비밀번호</td>
                	<td><input type="password" name="userPw" id="userPw" placeholder="비밀번호를 입력해주세요"></td>
            	</tr>
            	</table>
            	<input type="submit" value="로그인"/>
         </form>
        회원이 아니신가요?&nbsp;&nbsp; <a href="${path }/user/register">회원가입</a>

</body>
</html>