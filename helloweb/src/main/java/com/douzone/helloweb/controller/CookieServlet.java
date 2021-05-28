package com.douzone.helloweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final String COOKIE_NAME = "visitCount";

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int visitCount = 0; 
		
		// 쿠키 읽기
		Cookie[] cookies = request.getCookies();
		if(cookies != null && cookies.length > 0) {
			for(Cookie cookie : cookies) {
				if(COOKIE_NAME.equals(cookie.getName())) {
					visitCount = Integer.parseInt(cookie.getValue());
				}
			}
		}
		
		// 쿠키 굽기(쓰기)
		visitCount++;
		Cookie cookie = new Cookie(COOKIE_NAME, String.valueOf(visitCount));
		cookie.setPath(request.getContextPath());
		cookie.setMaxAge(24*60*60); //	1day
		// 응답 헤더에 넣은 거. 
		response.addCookie(cookie);
		
		response.setContentType("text/html; charset=utf-8");

		// 화면 출력(HTML, 응답 BODY)
		// 이렇게 하면 빈 개행을 하나 보냄. 바디 시작 
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>방문 횟수 : " + visitCount + "</h1>");
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
