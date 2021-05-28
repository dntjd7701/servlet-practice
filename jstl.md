	${pageContext.request.contextPath }

현재 위치 받기 

	<c:import url='/WEB-INF/views/includes/header.jsp'/>
	
	
header, footer, navigation 등 jsp 파일 import하기 


	<c:if test='${result == "fail" }'> </c:if>
	
if 사용, test에 구문 입력 


		Map<String, Object> map = new HashMap<>();
		request.setAttribute("m", map);
		
		<h1>map의 값</h1>
		${m.ival }<br/>
		${m.lval }<br/>
		${m.fval }<br/>
		${m.bval }<br/>

리스트, 맵의 값 가져오기 


	<%
		pageContext.setAttribute("newline", "\n");
	%>
	${fn:replace(sVal, newline,"<br/>") } 

	
구문 바꾸기, fn의 replace, 순서대로 문자열, 바꾸고싶은 문자, 바꿀 문자 순,
jstl에서 \n를 지원해주지 않기 때문에 개행 문자는 자바를 사용해야된다.




	${empty obj } <br/>
	${not empty vo } <br/>
	
	
==null or !=null  대신 사용, 



	<h1>요청 파라미터의 값</h1>
	--${param.a }--<br/>
	--${param.email }--<br/>
	
	
요청 파라미터의 값, 이름 입력 



	<c:set var="count" value="${fn:length(users) }" />
	
	
users라는 이름으로 보내진 리스트의 길이를 구하며, 이름을 count로 지정 	



	<c:forEach items='${users }' var='user' varStatus='status'>
	
	[${count-status.index }] (${status.index }:${status.count }) [$	{user.no }:${user.name }]<br/>

	</c:forEach>
	

items=받은 값(리스트) var는 값을 받을 곳,  varStatus의 이름을 status로
지정하고 status.index는 0부터 시작, count는 갯수로 1부터 증가.
