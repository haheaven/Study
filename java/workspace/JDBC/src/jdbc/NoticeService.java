package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NoticeService {
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String uid = "hahyebin";
	private String pwd = "1111";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	
	public List<Notice> getlist(int page, String field, String query) throws Exception{
	
	    int start = 1+ (page-1)*10;
	    int end = 10*page ;
	
	    String sql = "SELECT * FROM NOTICE_VIEW WHERE "+field+" LIKE ? AND NUM BETWEEN ? AND ?";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid,pwd);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%"+query+"%");
		st.setInt(2, start);
		st.setInt(3, end);
     	ResultSet rs = st.executeQuery();
		
     	List<Notice> list = new ArrayList<Notice>();
     	
		 while(rs.next()) {
		 int id = rs.getInt("ID");
		 String title = rs.getString("TITLE");
		 String writeId = rs.getString("WRITE_ID");
		 Date regDate = rs.getDate("REGDATE");
		 String content = rs.getString("CONTENT");
		 int hit = rs.getInt("hit");
		 String files = rs.getString("FILES");
		 
		 Notice notice = new Notice(
				 id,
				 title,
				 writeId,
				 regDate,
				 content,
				 hit,
				 files);
		 
		 list.add(notice);
		
		 }
	    rs.close();
		st.close();
		con.close();
   return list;  
	}

	 //scalar
		public int getCount() throws Exception {
			int count=0;
			 String sql = "SELECT count(ID) as COUNT FROM NOTICE";
				
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, uid,pwd);
				Statement st = con.createStatement();
		     	ResultSet rs = st.executeQuery(sql);
				
		     if(rs.next()) {
				 count = rs.getInt("COUNT");
		     }
			    rs.close();
				st.close();
				con.close();
				
			return count;
		}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
    public int inset(Notice notice) throws Exception {
    	String title = notice.getTitle();
		String writeid = notice.getWriteId();
		String content = notice.getContent();
		String files = notice.getFiles();
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "insert into NOTICE(title, write_id, content, files )  VALUES(?,?,?,?)";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid,pwd);
		//Statement st = con.createStatement();
     	PreparedStatement st =	con.prepareStatement(sql);
	   st.setNString(1, title);
	   st.setNString(2, writeid);
	   st.setNString(3, content);
	   st.setNString(4, files);
	 
	   
		
		int result = st.executeUpdate();
		System.out.println(result);
		
	
		st.close();
		con.close();

    	
    	return result;
    }
    public int update(Notice notice) throws Exception {
    	

		String title = notice.getTitle();
		String content = notice.getContent();
		String files = notice.getFiles();
		int ID = notice.getId();
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "UPDATE NOTICE SET " + 
				" TITLE =?," + 
				" CONTENT =?," + 
				" FILES = ?" + 
				" WHERE ID =?";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid,pwd);
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

    	
    	return result;
    }
    
    
    public int delete(int id) throws Exception {
    	

		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String sql = "DELETE FROM NOTICE WHERE ID =?";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid,pwd);
		//Statement st = con.createStatement();
     	PreparedStatement st =	con.prepareStatement(sql);
	
	   st.setInt(1, id);
	   
		
		int result = st.executeUpdate();
		System.out.println(result);
		
	
		st.close();
		con.close();
    	return result;
    }
}