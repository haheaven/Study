package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lect {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "SELECT * FROM NOTICE";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "hahyebin","1111");
		Statement st = con.createStatement();
     	ResultSet rs = st.executeQuery(sql);
		
		 while(rs.next()) {
		 int id = rs.getInt("ID");
		 String title = rs.getString("TITLE");
		 String writeId = rs.getString("WRITE_ID");
		 Date regDate = rs.getDate("REGDATE");
		 String content = rs.getString("CONTENT");
		 int hit = rs.getInt("hit");
		 System.out.printf("id:%d, title:%s, writeId : %s, date : %s, content:%s, hit:%d\n",
				 id, title, writeId, regDate, content, hit);
		 }
	    rs.close();
		st.close();
		con.close();

}
	}

