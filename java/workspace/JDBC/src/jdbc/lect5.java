package jdbc;

import com.newlecture.app.cosole.*;

public class lect5 {

	public static void main(String[] args) throws Exception {
		NoticeConsole console = new NoticeConsole();
		//int page;
	exit: 
		while(true) {
		console.printNoticeList();
	 int menu =	console.inputNoticeMenu();

	 switch(menu) {
	 case 1: //����ȸ
		 break;
	 case 2: //����
		 console.movePrevList();
		// page--;
		 break;
	 case 3: //����
		 console.moveNextList();
		// page++;
		 break;
	 case 4: //�۾���
		 break;
	 case 5: //�˻�
		console.inputSearchWord();
		 break;
	 case 6: //����
		 System.out.println("����");
		 break exit;
	 default : 
		 System.out.println("<<�����>> �޴��� 1~4������ �Է��� �� �ֽ��ϴ�.");
		 break;
	 }
	}
}

}
