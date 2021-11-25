package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.Board;
import dto.QnA;
import mybatis.config.DBService;

public class QnADao {
	private SqlSessionFactory factory;
	
	private static QnADao instance;
	private QnADao(){
		factory = DBService.getInstance().getFactory();
	}
	public static QnADao getInstance() {
		if( instance == null ) {
			instance = new QnADao();
		}return instance;
	}
	
	// 1. 로그인해서 전체리스트로 
	public List<QnA> selectlist(Map<String, Integer> map){
		SqlSession ss = factory.openSession();
		List<QnA> list = ss.selectList("dao.QnA.selectlist", map);
		ss.close();
		return list;
	}
	
	// 2. 전체 게시판의 조회 수 
	public int getCount(){
		SqlSession ss = factory.openSession();
		int result = ss.selectOne("dao.QnA.getCount");
		ss.close();
		return result;
	}
	
	// 3. 새글등록하기 
	public int insert(QnA qna) {
		SqlSession ss = factory.openSession(false);
		int result = ss.insert("dao.QnA.insert", qna);
		if( result > 0) ss.commit();
		ss.close();
		return result;
	}
	
	
	// 4, 상세보기 
	public QnA select(Long idx){
		SqlSession ss = factory.openSession();
		QnA qna = ss.selectOne("dao.QnA.select", idx);
		ss.close();
		return qna;
	}
	
	// 5. 조회수 증가
	public int hit(Long idx){
		SqlSession ss = factory.openSession(false);
		int result = ss.update("dao.QnA.hit", idx);
		if( result > 0) ss.commit();
		ss.close();
		return result;
	}
	
	// 6. 게시판 수정하기
	public int updateQnA(QnA qna) {
		SqlSession ss = factory.openSession(false);
		int result = ss.update("dao.QnA.updateQnA", qna);
		if( result > 0) ss.commit();
		ss.close();
		return result;	
	}
	
	// 7. 게시판 삭제하기 
	public int delete(long idx) {
		SqlSession ss = factory.openSession(false);
		int result = ss.delete("dao.QnA.delete", idx);
		if( result > 0) ss.commit();
		ss.close();
		return result;	
	}
	// 8. 게시판 사용자가 쓴 부분 파일로 저장하기 
	public List<QnA> AdminList(){
		SqlSession ss = factory.openSession();
		List<QnA> list = ss.selectList("dao.QnA.AdminList");
		ss.close();
		return list;
		
	}
	
	
	// 9. 게시물  검색 
	public List<QnA> searchQnA(Map<String, String> map){
		SqlSession ss = factory.openSession();
		List<QnA> list = ss.selectList("dao.QnA.searchQnA", map);
		ss.close();
		return list;	
	}
	
	
	//10. 게시물 수 검색 
	public int searchQnACount(Map<String, String> map) {
		SqlSession ss = factory.openSession();
		int cnt = ss.selectOne("dao.QnA.searchQnACount", map);
		ss.close();
		return cnt;
	}

	
	
} // end of class 
