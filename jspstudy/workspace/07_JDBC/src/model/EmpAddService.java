package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import dao.EmpDAO;
import dto.EmpDTO;

public class EmpAddService implements EmpService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name"); //추가하는 html에서 name 변수 받기
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setName(name);     // empDTO 객체에 파라미터 name 설정하기 
		
		EmpDAO empDAO = EmpDAO.getInstance(); 
		int result = empDAO.insertEmp(empDTO);  // 받은게 있다면  1을 반환(없으면 0) 이를 받을 변수를 지정한다. 
		
		
		
		ModelAndView modelAndView = null;
		
		if ( result > 0) {
		 modelAndView = new ModelAndView("/JDBC/selectList.emp", true);   // 데이터의 추가 삭제 수정은 시스템의 변화가 있으므로 redirect로 가야한다. 
		} else {
			// alert
		}
		return modelAndView;
	}

}
