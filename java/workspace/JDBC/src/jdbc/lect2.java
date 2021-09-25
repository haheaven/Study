package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lect2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		int ID = 4;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "DELETE FROM NOTICE WHERE ID =?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "hahyebin","1111");
		//Statement st = con.createStatement();
     	PreparedStatement st =	con.prepareStatement(sql);
	
	   st.setInt(1, ID);
	   
		
		int result = st.executeUpdate();
		System.out.println(result);
		
	
		st.close();
		con.close();

	}

}
