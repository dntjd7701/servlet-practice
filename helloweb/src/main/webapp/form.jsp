<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입</h1>
	<!-- method : get, post, put, delete -->
	<form method='post' action='/helloweb/join.jsp'>
			이메일:<input type='text' name='email' value=''/>
			<br/><br/>
			
			비밀번호:<input type='password' name='pwd' value=''/>
			<br/><br/>
			
			생년월일:
			<select name="birthYear">
				<option value='1995'>1995 yo</option>
				<option value='1996'>1996 yo</option>
				<option value='1997'>1997 yo</option>
			</select>
			
			<br/><br/>			
			성별:
			여<input type='radio' value='femail' name='gender' checked='checked'/>
			남<input type='radio' value='mail' name='gender'/>
			
			<br/><br/>			
			취미:
			코딩<input type='checkbox' value='coding' name='hobby'/>
			술먹기<input type='checkbox' value='drinking' name='hobby'/>
			수영<input type='checkbox' value='swimming' name='hobby'/>
			배드민턴 <input type='checkbox' value='badminton' name='hobby'/>
			
			
			<br/><br/>	
			자기소개:<br/>
			<textarea name='profile'>adsfsfasddfdasdfadsfasfdsadfsdfasfd</textarea>
			
			
			
			
			
			<br/><br/>
			<input type='submit' value='가입'/>
	</form>
	
	<br/>
	<br/>
	<a href='/helloweb/tag.jsp'>태그 연습</a>
	
	
	
</body>
</html>