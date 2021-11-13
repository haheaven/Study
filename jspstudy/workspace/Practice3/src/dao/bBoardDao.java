package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.bBoard;
import mybatis.config.MybatisSetting;

public class bBoardDao {
	private SqlSessionFactory factory;
	
	private static bBoardDao instance;
	private bBoardDao(){
		factory = MybatisSetting.getInstance().getFactory();
	}
	public static bBoardDao getInstance() {
		if( instance == null ) {
			instance = new bBoardDao();
		}return instance;
	}
	
	// 1. 로그인해서 전체리스트로 
	public List<bBoard> selectlist(){
		SqlSession ss = factory.openSession();
		List<bBoard> list = ss.selectList("dao.bBoard.selectlist");
		ss.close();
		return list;
	}
	
	// 2. 전체 게시판의 조회 수 
	public int getCount(){
		SqlSession ss = factory.openSession();
		int result = ss.selectOne("dao.bBoard.getCount");
		ss.close();
		return result;
	}
	
	// 3. 새글등록하기 
	public int insert(bBoard board) {
		SqlSession ss = factory.openSession(false);
		int result = ss.insert("dao.bBoard.insert", board);
		if( result > 0) ss.commit();
		ss.close();
		return result;
	}
	
	// 4, 상세보기 
	public bBoard select(long idx){
		SqlSession ss = factory.openSession();
		bBoard board = ss.selectOne("dao.bBoard.select", idx);
		ss.close();
		return board;
	}
	
	// 5. 조회수 증가
	public int hit(long idx){
		SqlSession ss = factory.openSession(false);
		int result = ss.update("dao.bBoard.hit", idx);
		if( result > 0) ss.commit();
		ss.close();
		return result;
	}
	
	// 6. 게시판 수정하기
	public int updateboard(bBoard board) {
		SqlSession ss = factory.openSession(false);
		int result = ss.update("dao.bBoard.updateboard", board);
		if( result > 0) ss.commit();
		ss.close();
		return result;	
	}
	
	public int delete(long idx) {
		SqlSession ss = factory.openSession(false);
		int result = ss.delete("dao.bBoard.delete", idx);
		if( result > 0) ss.commit();
		ss.close();
		return result;	
		
	}
	
	
	
	
	
	
	
	
	
	
} // end of class 
