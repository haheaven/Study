package practice2;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Company {
   private String name;
   private Scanner sc = new Scanner(System.in);
   private List<Staff> staffs;
   
     public Company(String name) {
    	 this.name =name;
    	 staffs = new ArrayList<Staff>();
     }
  
   public void addStaff() {
	   //메소드 내부에서 직접 처리한 방식 
	   try {
	    System.out.println("**사원추가**");
	    System.out.print("사원번호 >> ");
	    long staffNo = sc.nextLong();
	    System.out.print("사원이름 입력 > ");
	    String name = sc.next();
	    System.out.print("근무부서 입력 >> ");
	    String dept = sc.next();
	    staffs.add( new Staff(staffNo, name, dept));
	   } catch (Exception e) {
		   e.printStackTrace();
	   }
   }
   
   public void deleteStaff() {
	   //사원번호를 입력받아서 해당 사원 삭제 
	   //deleteStaff() 메소드를 호출하는 곳에서 예외처리
	 try {  
	   System.out.println("***사원 삭제***");
	   System.out.print("삭제할 사원번호 >> ");
	   long staffNo = sc.nextLong();
	   
	  for(Staff staff : staffs) {
		  if(staff.getStaffNo() == staffNo) {
			  System.out.println(staff.getName() + "("+staff.getStaffNo()+") 을 삭제합니다.");
				 staffs.remove(staff);
				 return; // 삭제 후 메소드 종료
			  } 
	    } 
   	  System.out.println("사원번호  "+staffNo + "를 가진 사원이 없습니다.");
	 } catch(Exception e ) {
		 e.printStackTrace();
	 }
}
   
   public void printStaff() {
	   //사원의 이름을 입력 받아서 해당 사원 모두 조회 
	   //printStaff()를 호출하는 곳에서 모두 예외 처리
	  
	   try {
	   System.out.println("***사원 조회***");
	   System.out.print("조회할 사원이름  >> ");
	   String name = sc.next();
	 
	   for(Staff staff : staffs) {
		 if(staff.getName().equals(name)){
	       System.out.println(staff);
	       return;
		 }
		}
	   System.out.println(name +"을 가진사원은 없습니다.");
	   }catch(Exception e) {
          e.printStackTrace();
	   }
  }
   
   public void printAllStaff() {
	   System.out.println("**전체 사원 목록 **");
	   for(Staff s : staffs) {
		  System.out.println(s);
	   }
   }
   
   
   
   public void menu() {
	   System.out.println("***************");
	   System.out.println("***1.사원등록****");
	   System.out.println("***2.사원삭제****");
	   System.out.println("***3.사원조회****");
	   System.out.println("***4.전체조회****");
	   System.out.println("***0.관리종료****");
	   System.out.println("***************");
   }
   
   
   public void staffManage() {  
	   try{
		   while(true) {
	   
		   menu();
		   System.out.println("선택 >>> ");
		   int choice = sc.nextInt();
		   
		   switch(choice) {   
		   case 1:  addStaff();   break;
		   case 2: deleteStaff(); break;
		   case 3: printStaff();  break;
		   case 4: printAllStaff(); break;
		   case 0: System.out.println("**사원관리종료**"); return; //staffManage() 메소드를 종료하는 return;	   
		    } //switch 종료
	      } //while 종료
	 }catch (Exception e ) {
		   System.out.println("예외발생");
	   }
   
   }
   
  
   
   
   
   
   
}
