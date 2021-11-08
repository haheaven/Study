package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.EmpDAO;

public class EmpFindEmpListService implements EmpService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		
		EmpDAO empDAO = EmpDAO.getInstance();   // dao 객체를 갖고오기. 그 객체에서 empList를 갖고오는 메소드를 empList에 저장하기 
		request.setAttribute("empList", empDAO.selectEmpList());
		
		ModelAndView modelAndView = new ModelAndView("views/selectEmpList.jsp", false);

		return modelAndView;
	}

}
