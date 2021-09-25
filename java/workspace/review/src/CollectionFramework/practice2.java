package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
class Company{
	private String name;
	private List<Staff> staffs;
	private Scanner sc =new Scanner(System.in);
	

	public Company(String name) {
		this.name = name;
		staffs = new ArrayList<Staff>();
		
	}
	
	private void addStaff() {
		try {
			System.out.println(" ===사원 추가=== ");
			System.out.print("사원 번호 >> ");
		    int staffNo = sc.nextInt();
		    System.out.print("사원 이름 >> ");
		    String name = sc.next();
		    System.out.print("부서 이름 >> ");
		    String dept = sc.next();
		    staffs.add(new Staff(staffNo, name, dept));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void deleteStaff() {
	try {
		System.out.println(" ==사원 삭제== ");
		System.out.print("삭제할 사원 번호 >> ");
		int staffNo = sc.nextInt();
		for(Staff staff : staffs) {
			if(staff.getStaffNo()==staffNo) {
				System.out.println("삭제한 직원은 "+ staff.getName() +"입니다.");
				staffs.remove(staff);
				return;
			}
		}System.out.println(staffNo +"사원번호는 존재하지 않습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	private void staffInfo() {
		try {
			System.out.println(" ===사원 조회===");
			System.out.print("조회할 사원 번호 >> ");
			int staffNo = sc.nextInt();
			for(Staff st : staffs) {
				if(st.getStaffNo()==staffNo) {
					System.out.println("조회한 직원은 "+ st.getName() +"입니다.");
					System.out.println(st);
					return;
				}
			} System.out.println(staffNo + "의 사원번호를 가진 직원은 없습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		}
	
	
	private void companyInfo() {
		System.out.println(" ===전체 직원 조회=== ");
		 System.out.println("회사명 : " +name);
    	 if(staffs.size() == 0 ) {
    		 System.out.println("현재 근무중인 사원이 없습니다.");
    		 return;
    	 }
    	 for(Staff staff :staffs) {
    		 System.out.println(staff);
    	 }	
	}
	
	
	private void menu() {
		 System.out.println("1. 사원 추가");
    	 System.out.println("2. 사원 삭제");
    	 System.out.println("3. 사원 조회");
    	 System.out.println("4. 회사 정보");
    	 System.out.println("0. 종료 ");
	}
	
	public void companyManage() {
		try {
			while(true) {
				menu();
				switch(sc.nextInt()) {
				case 1: addStaff(); break;
				case 2: deleteStaff(); break;
				case 3: staffInfo(); break;
				case 4: companyInfo(); break;
				case 0: System.out.println(" 프로그램 종료 "); return;
			    default : System.out.println("잘못입력하셨습니다"); 
					
				}
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
}



@Data
@AllArgsConstructor
class Staff{
	private long staffNo;
	private String name;
	private String dept;
	
	
}





public class practice2 {
	public static void main(String[] args) {
		
		Company company = new Company("스마트소프트");
		company.companyManage();
		
	}

}
