package chapter5;

public class Ex5_07 {

	public static void main(String[] args) {
	   if(args.length!=1) {
		System.out.println("USAGE : java Ex5_07");
	   System.exit(0);
	}
	   int money = Integer.parseInt(args[0]);
	   System.out.println("money : "+ money);
	   
	   
	   int[] coinUnit = {500, 100, 50, 10}; //동전단위 
	   int[] coin     = {5, 5, 5, 5}; //단위별 동전 수
	   
	   for(int i =0; i < coinUnit.length; i++) {
		   int coinNum = 0;
		    coinNum = money/coinUnit[i];
		    if(coinNum<=coin[i]) {
		    	coin[i] -= coinNum;
		    } else {
		    	coinNum = coin[i];
		    	coin[i] =0;
		    }
		    money %= coinUnit[i];
		  
		   System.out.println("coinNum :" + coinNum);
	   
	   }
	   if(money>0) {
		   System.out.println("==거스름돈이 부족==");
		   System.exit(0);
	   }
	   System.out.println("==남은 동전 수==");
	   
	   for(int i =0; i<coin.length; i++) {
		   System.out.println(coinUnit[i]+"원은"+coin[i]);
	   }
	}

}
