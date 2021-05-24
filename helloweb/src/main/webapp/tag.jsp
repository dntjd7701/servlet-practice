<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello World</h1>
	<h2>Hello World</h2>
	<h3>Hello World</h3>
	<h4>Hello World</h4>
	<h5>Hello World</h5>

	<table border='1' cellspacing='0' cellpadding='10'>
		<!-- table row -->
		<tr>
			<!--td 행렬  -->
			<th>글번호</th>
			<th>글제목</th>
			<th>작성자</th>
		</tr>
		<tr>
			<td>1</td>
			<td>안녕</td>
			<td>둘리</td>
		</tr>
		<tr>
			<td>2</td>
			<td>안녕</td>
			<td>마이콜</td>
		</tr>
		<tr>
			<td>3</td>
			<td>안녕</td>
			<td>또치</td>
		</tr>
	</table>
	<br />
	<img src='img/images.jpeg' style='width: 80px; border: 5px solid' />
	<img src='/helloweb/img/images.jpeg' />
	<br />
	<a href='form.jsp'>폼으로 가기 </a>
	<br />
	<a href='hello.jsp?name=woosung&email=k@gmail.com'>Hello </a>
	
	
	
	<p>5월 24, 2021 2:13:58 오후 org.apache.catalina.core.StandardService
		startInternal INFO: 서비스 [Catalina]을(를) 시작합니다. 5월 24, 2021 2:13:58 오후
		org.apache.catalina.core.StandardEngine startInternal INFO: 서버 엔진을
		시작합니다: <br/> [Apache Tomcat/8.5.66] 5월 24, 2021 2:13:59 오후
		org.apache.coyote.AbstractProtocol start INFO: 프로토콜 핸들러
		["http-nio-8080"]을(를) 시작합니다. 5월 24, 2021 2:13:59 오후
		org.apache.catalina.startup.Catalina start INFO: Server startup in 564
		ms
	</p>



</body>
</html>