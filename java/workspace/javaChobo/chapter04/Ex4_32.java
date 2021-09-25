package chapter04;

import java.util.Scanner;

public class Ex4_32 {

	public static void main(String[] args) {
		int menu = 0, num=0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴를 선택하세요 > ");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			} else if ( 1 > menu ||menu > 3) {
				System.out.println("메뉴 잘못 선택");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}
		
	}

}
