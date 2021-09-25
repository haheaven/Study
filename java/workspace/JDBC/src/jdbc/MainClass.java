package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass {

	public static void main(String[] args) {
		// class class�� �ش� Ŭ���� ����� �� �֤��� ������
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		   
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "SCOTT";
		String password = "TIGER";
		
		// SQL Ŀ�ؼ� �ϱ� 
		Connection con = DriverManager.getConnection(url, user, password);
		
		 // �ڹٿ��� ������ �ѱ涩 ; ����
		String sql = "CREATE TABLE SAMPLE(NO NUMBER)";  
	//	String query = "INSERT INTO SAMPLE(NO) VALUES(10)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		//PreparedStatement pss = con.prepareStatement(query);
		
		ps.executeUpdate();
		//pss.executeUpdate();
		
		System.out.println("sample 성공");
		
		
		} catch (Exception e) {
			System.out.println("fail");
		}
	}

}
