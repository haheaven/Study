package review;





class VendingMachineTest{
	
     	//돈을 받아서 음료를 반환하는 메서드
		//돈         음료
		//500        생수
		//1000       사이다
		//1500       콜라
		
		// 1. 반환타입 : String(생수, 사이다, 콜라)
		// 2. 메서드명 : pushButton
		// 3. 반환타입 : int 1개
	
	String pushButton(int money) {
	
		if(money == 500) {
			return "생수";
		}else if(money==1000) {
			return "사이다";
		}else if (money == 1500) {
			return "콜라";
		}else 
	         return money+"원";
	}
	}
	

public class VendingMachine {

	public static void main(String[] args) {
		
		VendingMachineTest VT = new VendingMachineTest();
		
		System.out.println(VT.pushButton(500));
		System.out.println(VT.pushButton(1000));
		System.out.println(VT.pushButton(1500));
		System.out.println(VT.pushButton(600));
		
		

	}

}
