<%@page import="com.douzone.guestbook.dao.GuestbookDao"%>
<%@page import="com.douzone.guestbook.vo.GuestbookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <%
 	request.setCharacterEncoding("utf-8");
 	Long no = Long.parseLong(request.getParameter("no"));
 	String password = request.getParameter("delete_password");
 	boolean result = false;
	result = new GuestbookDao().delete(no, password);
	
	
 	 if(result != false){
		response.sendRedirect(request.getContextPath());
 	} else{
 		
 %>
 		<a href="<%=request.getContextPath()%>">잘못 입력하셨습니다.</a> <br />
 <%		
 	} 
%>