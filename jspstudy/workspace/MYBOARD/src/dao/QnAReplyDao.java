package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.QnAReply;
import dto.Reply;
import mybatis.config.DBService;

public class QnAReplyDao {
	private SqlSessionFactory factory;
	
	private static QnAReplyDao instance;
	private QnAReplyDao(){
		factory = DBService.getInstance().getFactory();
	}
	
	public static QnAReplyDao getInstance() {
		if( instance == null ) {
			instance = new QnAReplyDao();
		}return instance;
	}

	// 1. 댓글리스트 
	public List<QnAReply> selectListQnAReply(Long idx){
		SqlSession ss = factory.openSession();
		List<QnAReply> list = ss.selectList("dao.QnAReply.selectListQnAReply", idx);
		ss.close();
		return list;
	}
	// 2. 댓글삽입 
	public int insertQnAReply(QnAReply reply) {
		SqlSession ss = factory.openSession(false);
		int result = ss.insert("dao.QnAReply.insertQnAReply", reply);
		if( result > 0 ) ss.commit();
		ss.close();
		return result;
	}
	
} // end of class

