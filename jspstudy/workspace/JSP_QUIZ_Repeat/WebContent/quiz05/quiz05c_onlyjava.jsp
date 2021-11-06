<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>

<%
	request.setCharacterEncoding("utf-8");
	String check = request.getParameter("check");  // agree or disagree
	if(check.equals("agree") ){                   // 회원가입 동의시 회원정보 파일로 저장하기 
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		String filename = id+".txt";
		String realpath = request.getServletContext().getRealPath("archive");
		File dir = new File(realpath);
		if ( dir.exists() == false) { dir.mkdirs(); } // 폴더없으면 생성하기 
		
		File file = new File(dir, filename); // 진짜 파일 생성 
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file)); //파일 출력 
		bw.write("아이디 : "+id+"\n");
		bw.write("비밀번호 : "+pw+"\n");
		bw.write("이름 : "+name+"\n");
		bw.flush();
		if( bw != null ){ bw.close();	}
		
	
		//파일의 이름을 가지고 가야지 파일읽기가능하다. 
		response.sendRedirect("quiz05d.jsp?filename="+filename);       //ct의 페이지에 대한 변화가 있어야하므로 redirect 사용 
		
	} else {
		response.sendRedirect("quiz05e.jsp");  // 가입 안했다는 페이지 
	}


%>




