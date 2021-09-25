package com.newlecture.app.cosole;

import java.util.List;
import java.util.Scanner;

import jdbc.Notice;
import jdbc.NoticeService;

public class NoticeConsole {
	
	
	private NoticeService service;
	private int page;
	private String searchField;
	private String searchWord;
	
	
	public NoticeConsole() {
		service = new NoticeService();
		page = 1;
		searchField = "TITLE";
		searchWord ="";
	}
	
	
	public void printNoticeList() throws Exception {
		List<Notice> list = service.getlist(page, searchField, searchWord);
	    int count = service.getCount();
	    int lastPage = count/10;
		lastPage = count%10 == 0? lastPage : lastPage+1;
	    
	    
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.printf("<��������> �� %d �Խñ�\n", count);
		System.out.println("������������������������������������������������������������������������������������������������������������");
        for(Notice n : list) {
		System.out.printf("%d/ %s / %s / %s\n", 
				n.getId(),
				n.getTitle(),
				n.getWriteId(),
				n.getRegDate());
        }
        System.out.println("������������������������������������������������������������������������������������������������������������");
        System.out.printf("               %d/%d pages\n", page, lastPage);
		
		
		
		
		
	}
	public int inputNoticeMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1.����ȸ/ 2.����/ 3.����/ 4.�۾��� / 5.�˻�  /6.���� >");
		String menu_ = sc.nextLine();
		int menu = Integer.parseInt(menu_);
		
		
		return menu;
	}


	public void movePrevList() {
		if(page ==1) {
			System.out.println("====================================");
			System.out.println("[���� �������� �����ϴ�.]");
			System.out.println("====================================");
			return;
		}
		page--;
	}


	public void moveNextList() throws Exception {
		    int count = service.getCount();
		    int lastPage = count/10;
			lastPage = count%10 == 0? lastPage : lastPage+1;
		    
		if(page == lastPage) {
			
			System.out.println("====================================");
			System.out.println("[���� �������� �����ϴ�.]");
			System.out.println("====================================");
			return;
		}
		page++;
	}


	public void inputSearchWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �˻�����(title/content/writerId)�߿� �ϳ��� �Է��ϼ���");
		System.out.print(">");
		searchField = sc.nextLine();
		
		System.out.print("�˻��� > ");
		searchWord =sc.nextLine();
		
		
		
		
		
	}
}

