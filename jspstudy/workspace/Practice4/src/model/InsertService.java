package model;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import common.ModelAndView;
import dao.aStudentDao;
import dto.aStudent;

public class InsertService implements aStudentService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String name = request.getParameter("name");
		int grade = Integer.parseInt(request.getParameter("grade"));
		String addr = request.getParameter("addr");
		String email = request.getParameter("email");
		String score = request.getParameter("score");
		String major = request.getParameter("major");

		aStudent student = new aStudent();
		student.setName(name);
		student.setGrade(grade);
		student.setAddr(addr);
		student.setEmail(email);
		student.setMajor(major);
		student.setScore(score);
		
		int result = aStudentDao.getInstance().insert(student);
		
		JSONObject obj = new JSONObject();
		obj.put("result", result);
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(obj);
		out.close();

		return null;
	}

}
