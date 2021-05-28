package jstlel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/01")
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 값
		int iVal = 10;
		long lVal = 10;
		float fVal = 3.14f;
		boolean bVal = true;
		String sVal = "가\n나\n다\n라\n마\n바\n사";

		// 객체
		Object obj = null;
		UserVo userVo = new UserVo();

		userVo.setNo(10L);
		userVo.setName("우성");
		
		
		// map
		Map<String, Object> map = new HashMap<>();
		map.put("ival", iVal);
		map.put("lval", iVal);
		map.put("fval", iVal);
		map.put("bval", iVal);
		
		request.setAttribute("iVal", iVal);
		request.setAttribute("lVal", lVal);
		request.setAttribute("fVal", fVal);
		request.setAttribute("bVal", bVal);
		request.setAttribute("sVal", sVal);
		request.setAttribute("vo", userVo);
		request.setAttribute("obj", obj);
		request.setAttribute("m", map);

		request.getRequestDispatcher("/WEB-INF/views/01.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
