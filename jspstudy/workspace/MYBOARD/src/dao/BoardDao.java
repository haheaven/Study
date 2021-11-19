package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.Board;
import mybatis.config.DBService;

public class BoardDao {
	private SqlSessionFactory factory;
	
	private static BoardDao instance;
	private BoardDao(){
		factory = DBService.getInstance().getFactory();
	}
	public static BoardDao getInstance() {
		if( instance == null ) {
			instance = new BoardDao();
		}return instance;
	}
	
	// 1. 로그인해서 전체리스트로 
	public List<Board> selectlist(){
		SqlSession ss = factory.openSession();
		List<Board> list = ss.selectList("dao.Board.selectlist");
		ss.close();
		return list;
	}
	
	// 2. 전체 게시판의 조회 수 
	public int getCount(){
		SqlSession ss = factory.openSession();
		int result = ss.selectOne("dao.Board.getCount");
		ss.close();
		return result;
	}
	
	// 3. 새글등록하기 
	public int insert(Board board) {
		SqlSession ss = factory.openSession(false);
		int result = ss.insert("dao.Board.insert", board);
		if( result > 0) ss.commit();
		ss.close();
		return result;
	}
	
	
	// 4, 상세보기 
	public Board select(Long idx){
		SqlSession ss = factory.openSession();
		Board board = ss.selectOne("dao.Board.select", idx);
		ss.close();
		return board;
	}
	
	// 5. 조회수 증가
	public int hit(Long idx){
		SqlSession ss = factory.openSession(false);
		int result = ss.update("dao.Board.hit", idx);
		if( result > 0) ss.commit();
		ss.close();
		return result;
	}
	
	// 6. 게시판 수정하기
	public int updateboard(Board board) {
		SqlSession ss = factory.openSession(false);
		int result = ss.update("dao.Board.updateboard", board);
		if( result > 0) ss.commit();
		ss.close();
		return result;	
	}
	
	// 7. 게시판 삭제하기 
	public int delete(long idx) {
		SqlSession ss = factory.openSession(false);
		int result = ss.delete("dao.Board.delete", idx);
		if( result > 0) ss.commit();
		ss.close();
		return result;	
	}
	// 8. 게시판 사용자가 쓴 부분 파일로 저장하기 
	public List<Board> AdminList(){
		SqlSession ss = factory.openSession();
		List<Board> list = ss.selectList("dao.Board.AdminList");
		ss.close();
		return list;
		
	}

	
	
} // end of class 
