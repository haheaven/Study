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
	 case 1: //상세조회
		 break;
	 case 2: //이전
		 console.movePrevList();
		// page--;
		 break;
	 case 3: //다음
		 console.moveNextList();
		// page++;
		 break;
	 case 4: //글쓰기
		 break;
	 case 5: //검색
		console.inputSearchWord();
		 break;
	 case 6: //종료
		 System.out.println("종료");
		 break exit;
	 default : 
		 System.out.println("<<사용방법>> 메뉴는 1~4까지만 입력할 수 있습니다.");
		 break;
	 }
	}
}

}
