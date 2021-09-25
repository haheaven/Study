package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lect1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
		String title = "test3";
		String content = "hahaha3";
		String files = "";
		int ID = 4;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "UPDATE NOTICE SET " + 
				" TITLE =?," + 
				" CONTENT =?," + 
				" FILES = ?" + 
				" WHERE ID =?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "hahyebin","1111");
		//Statement st = con.createStatement();
     	PreparedStatement st =	con.prepareStatement(sql);
	   st.setNString(1, title);
	   st.setNString(2, content);
	   st.setNString(3, files);
	   st.setInt(4, ID);
	   
		
		int result = st.executeUpdate();
		System.out.println(result);
		
	
		st.close();
		con.close();

	}

}
