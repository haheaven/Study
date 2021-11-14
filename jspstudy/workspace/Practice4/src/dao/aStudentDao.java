package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.aStudent;
import mybatis.config.DBService;

public class aStudentDao {
	private SqlSessionFactory factory;
	
	private static aStudentDao instance;
	private aStudentDao() {
		factory = DBService.getInstance().getFactory();
	}
	public static aStudentDao getInstance() {
		if( instance == null ) {
			instance = new aStudentDao();
		} return instance;
	}
	
	// 전체 리스트 
	public List<aStudent> selectlist(){
		SqlSession ss = factory.openSession();
		List<aStudent> list = ss.selectList("dao.astudent.selectlist");
		ss.close();
		return list;
	}
	
	// 리스트 수 
	public int getCount() {
		SqlSession ss = factory.openSession();
		int result = ss.selectOne("dao.astudent.getCount");
		ss.close();
		return result;
	}
	
	// 학생 등록하기 
	public int insert(aStudent student) {
		SqlSession ss = factory.openSession(false);
		int result = ss.insert("dao.astudent.insert", student);
		if( result > 0) ss.commit();
		ss.close();
		return result;
	}
	// 상세보기 
	public aStudent selectone(long stuNo) {
		SqlSession ss = factory.openSession();
		aStudent s = ss.selectOne("dao.astudent.selectone", stuNo);
		ss.close();
		return s;
	}
	
	// 수정하기 
	public int update(aStudent student) {
		SqlSession ss = factory.openSession(false);
		int result = ss.update("dao.astudent.update", student);
		if( result > 0) ss.commit();
		ss.close();
		return result;
	}
	
    // 삭제하기 
    public int delete(long stuNo) {
		SqlSession ss = factory.openSession(false);
		int result = ss.delete("dao.astudent.delete", stuNo);
		if( result > 0) ss.commit();
		ss.close();
		return result;
	}
	
	// 학년별 
	public List<aStudent> selectGrade1List(){
		SqlSession ss = factory.openSession();
		List<aStudent> list = ss.selectList("dao.astudent.selectGrade1List");
		ss.close();
		return list;		
	}
	public List<aStudent> selectGrade2List(){
		SqlSession ss = factory.openSession();
		List<aStudent> list = ss.selectList("dao.astudent.selectGrade2List");
		ss.close();
		return list;		
	}
	
	public List<aStudent> selectGrade3List(){
		SqlSession ss = factory.openSession();
		List<aStudent> list = ss.selectList("dao.astudent.selectGrade3List");
		ss.close();
		return list;		
	}
	
	
	
	
	
	
	

} // end of class
