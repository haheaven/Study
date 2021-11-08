package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import dto.EmpDTO;
import javafx.scene.chart.PieChart.Data;



public class EmpDAO {
	private static EmpDAO empDAO;
	private EmpDAO(){}
	
	
	public static EmpDAO getInstance() {
		if( empDAO == null) {
		empDAO = new EmpDAO();
	 }return empDAO;
  }     // 싱글톤 객체 생성 --> 한객체에서 데이터를  삽입 수정 삭제 해야하므로 객체는 하나여야함 

	// context.xml 내용으로 DataSource 객체 생성 
	private static DataSource dataSource;
	static {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle11g");
		} catch(NamingException e) {
			e.printStackTrace();
		}
	}   // 처음 empDAO객체가 생성되면서 데이터소스 객체가 생성되게 만듦 그 객체의 생성은 static{}이 함께 실행되면서 루트를 갖고 옴
	
	/* field */
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	// method 
	
	// 1. 접속 해제 메서드 --> 공통된 부분이기 때문에 중복 없애려고 함수로 따로 생성 
	public void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if( con != null ) { con.close(); }
			if( ps != null ) { ps.close(); }
			if( rs != null ) { rs.close(); }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 2. 삽입 
	public int insertEmp(EmpDTO empDTO) {    // EmpDTO 는 데이터베이스 테이블과 같은 컬럼값을 가진 자바 소스이다. database transfer obj 
		int result = 0; //생성된 값 있는지 없는지 판단하기 위한 변수 
		try {
			con = dataSource.getConnection();
			sql = "INSERT INTO emp VALUES(emp_seq.nextval, ?, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, empDTO.getName());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		return result;
	}
	
	
	// 3. 삭제 
	public int deleteEmp(Long num) {
		int result = 0;
		try {
			con = dataSource.getConnection();
			sql = "DELETE FROM emp WHERE num= ?";
			ps = con.prepareStatement(sql);
			ps.setLong(1, num);
			result = ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		
		return result;
	
	}
	
	// 4. 수정 
	public int updateEmp(EmpDTO empDTO) {
		int result = 0;
		try {
			con = dataSource.getConnection();
			sql = "UPDATE emp SET name =? WHERE num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, empDTO.getName());
			ps.setLong(2, empDTO.getNum());
			result = ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con, ps, null);
		}
		return result;
	}
	
	
	
	// 5. 개별 조회 
	public EmpDTO selectEmp(Long num) {   //기본키인 번호받아서 개별사원조회함!
		EmpDTO empDTO = new EmpDTO();
		try {
			con = dataSource.getConnection();
			sql = "SELECT num, name, hire FROM emp WHERE num=?";
			ps = con.prepareStatement(sql);
			ps.setLong(1, num);
			rs = ps.executeQuery();
			if( rs.next()) {
				empDTO = new EmpDTO();
				empDTO.setNum(num);
				empDTO.setName( rs.getString("name"));
				empDTO.setHire( rs.getDate("hire"));
			}
		} catch( Exception e) {
			e.printStackTrace();
		}finally {
			close(con, ps, rs);
		}
		
		return empDTO;
	}
	
	// 6. 전체 조회
	public List<EmpDTO> selectEmpList(){
		List<EmpDTO> empList = new ArrayList<EmpDTO>();
		
		try {
			con = dataSource.getConnection();
			sql = "SELECT num, name, hire FROM emp";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while ( rs.next()) {
				EmpDTO empDTO = new EmpDTO();
				empDTO.setNum(rs.getLong(1));
				empDTO.setName( rs.getString("name"));
				empDTO.setHire( rs.getDate("hire"));
				empList.add(empDTO);
			}
		} catch( Exception e) {
			e.printStackTrace();
		}finally {
			close(con, ps, rs);
		}
		
		
		return empList;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
