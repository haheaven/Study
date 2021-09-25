package review;




import java.util.Scanner;
class VendingMachine2 {	
				
				
int water = 500; int cider =1000; int coke = 1500;
int change;   int shortmoney; 
		
Scanner sc = new Scanner(System.in);
		
String pushButton() {
	
 while(true) {
			
System.out.print("음료수를 선택해세요(1.생수:500원, 2.사이다:1000원, 3.콜라:1500) 4.반환 >> ");		
int choice = sc.nextInt();
System.out.println("돈을 넣어주세요 >> ");
int money =  sc.nextInt();
				
				
	switch(choice) {
	  case 1: 
       //잔돈 
		change = money - water;
        //부족한돈
		shortmoney = Math.abs(water-money);
		  if(money>=water) {     //내돈이 가격보다 많은 경우 
		    if(change > 0) {   //가격보다 많고 잔돈이 남는경우 
			  System.out.println("생수입니다, 잔돈 " + change +"원 가져가세요."); //생수와 잔돈 출력 
		    } else  System.out.println("생수입니다.");  //잔돈이 0이면 생수만 출력
				    		
		 } else  //돈이 부족한 경우 
			 System.out.println(shortmoney+ "원이 부족합니다. "+money +"원은 가져가세요.");
			    break;
				      
	 case 2: 
	   change = money -cider;
	   shortmoney = Math.abs(cider-money);
		 if(money>=cider) {
		   if(change > 0) {
				System.out.println("사이다입니다, 잔돈 " + change +"원 가져가세요.");
			  } else   System.out.println("사이다입니다.");
				    			
		   } else
			    System.out.println(shortmoney+ "원이 부족합니다. "+money +"원은 가져가세요.");
				  break;
				      
	  case 3: 
		 change = money - coke;
	     shortmoney = Math.abs(coke-money);
		   if(money>=coke) {
			  if(change > 0) {
				System.out.println("콜라입니다, 잔돈 " + change +"원 가져가세요.");
			  } else System.out.println("콜라입니다.");
				    			
		    } else
			    System.out.println(shortmoney+ "원이 부족합니다. "+money +"원은 가져가세요.");
				    break;
                       
	 case 4:
		 System.out.println("반환을 입력했습니다. 돈 " +money+"원을 가져가세요.");
			break;
				      
	 default :
	   System.out.println("잘못 입력했습니다. 돈 " +money+"원을 가져가세요.");
	    	 break;
	} // end of switch
							
	        return "이용해 주셔서 감사합니다. 안녕히 가세요";
					
			} //end of while
		}
	}




public class VendingMachineChange{
	public static void main(String[] args) {
	     VendingMachine2 vm =new VendingMachine2();
	
			System.out.println(vm.pushButton());

			
	}
}