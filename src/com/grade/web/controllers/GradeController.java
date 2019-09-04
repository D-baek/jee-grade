package com.grade.web.controllers;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.GradeBean;
import com.grade.web.pool.Constants;
import com.grade.web.service.GradeService;
import com.grade.web.serviceImpls.GradeServiceImpl;

@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("액션 : "+action);
		String dest = request.getParameter("dest");
		System.out.println("목적지 :"+dest );
		switch(action) {
		case "move" :
			request.getRequestDispatcher(String.format(
					Constants.VIEW_PATH,
					"grade",
					request.getParameter("dest")))
			.forward(request,response);
			break;
		case "join" :
			String ssn = request.getParameter("ssn");	
			String name = request.getParameter("name");
			String kor = request.getParameter("kor");
			String eng = request.getParameter("eng");
			String math = request.getParameter("math");
			String society = request.getParameter("society");
			GradeBean param = new GradeBean();
			param.setSsn(ssn);
			param.setName(name);
			param.setKor(kor);
			param.setEng(eng);
			param.setMath(math);
			param.setSociety(society);
			GradeService service = new GradeServiceImpl();
			service.createGrade(param);
			request.getRequestDispatcher(String.format(
					Constants.VIEW_PATH,
					"student",
					request.getParameter("dest")))
			.forward(request,response);
			break;
		case "login" : break;
		}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
