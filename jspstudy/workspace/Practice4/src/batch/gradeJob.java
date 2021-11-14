package batch;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import dao.aStudentDao;
import dto.aStudent;

public class gradeJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
	    
		
		
		// STUDENT 테이블에서 ave순으로 TOP3 가져오기
		List<aStudent> list = aStudentDao.getInstance().selectGrade1List();
		List<aStudent> list2 = aStudentDao.getInstance().selectGrade2List();
		List<aStudent> list3 = aStudentDao.getInstance().selectGrade3List();
	

		// list를 파일로 만들기
		File file = new File("grade1.txt");
		try (BufferedWriter bw = new BufferedWriter( new FileWriter(file))) {    // try-catch resource => close() 생략 가능
			for(aStudent student : list) {
				bw.write(student.getStuNo()+",");
				bw.write(student.getName()+",");
				bw.write(student.getGrade()+",");
				bw.write(student.getAddr()+",");
				bw.write(student.getEmail()+",");
				bw.write(student.getScore()+",");
				bw.write(student.getRegister()+ "\n");
			}
			System.out.println("grade1.txt 파일생성완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// list를 파일로 만들기
		File file2 = new File("grade2.txt");
		try (BufferedWriter bw = new BufferedWriter( new FileWriter(file2))) {    // try-catch resource => close() 생략 가능
			for(aStudent student : list2) {
				bw.write(student.getStuNo()+",");
				bw.write(student.getName()+",");
				bw.write(student.getGrade()+",");
				bw.write(student.getAddr()+",");
				bw.write(student.getEmail()+",");
				bw.write(student.getScore()+",");
				bw.write(student.getRegister()+ "\n");
			}
			System.out.println("grade2.txt 파일생성완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		// list를 파일로 만들기
		File file3 = new File("grade3.txt");
		try (BufferedWriter bw = new BufferedWriter( new FileWriter(file3))) {    // try-catch resource => close() 생략 가능
			for(aStudent student : list3) {
				bw.write(student.getStuNo()+",");
				bw.write(student.getName()+",");
				bw.write(student.getGrade()+",");
				bw.write(student.getAddr()+",");
				bw.write(student.getEmail()+",");
				bw.write(student.getScore()+",");
				bw.write(student.getRegister()+ "\n");
			}
			System.out.println("grade3.txt 파일생성완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
