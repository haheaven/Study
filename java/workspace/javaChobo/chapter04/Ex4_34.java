package chapter04;

import java.util.Scanner;

public class Ex4_34 {

	public static void main(String[] args) {
		int menu = 0, num=0;
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴를 선택하세요 > ");
			
			String tmp = scanner.nextLine(); //화면에 입력받은 내용을 tmp에 저장 
			menu = Integer.parseInt(tmp);    //입력받은 문자열(tmp)을 숫자로 변환 
			
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			} else if ( 1 > menu ||menu > 3) {
				System.out.println("메뉴 잘못 선택");
				continue;
			}
			for(;;) {
				System.out.print("계산할 값 입력");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0)
					break;
				if(num==99)
					break outer; //전체종료 for문과 while문을 모두 벗어난다. 
				switch(menu) {
				case 1:
					System.out.println("result=" + num*num);
					break;
				case 2:
					System.out.println("result=" + Math.sqrt(num));
					break;
				case 3:
					System.out.println("result=" + Math.log(num));
					break;
				}
			} // for(;;)	
	  } // while
  } //main
}