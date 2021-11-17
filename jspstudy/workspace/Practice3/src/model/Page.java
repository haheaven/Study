package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ModelAndView;

public class Page implements BBoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		
		Integer idxx =  (Integer)(session.getAttribute("idx"));
		
		if(idxx != null) {
			session.removeAttribute("idxx");
		}
		return new ModelAndView("views/selectboard.jsp", false);
	}

}
