package chap5;
//문제 5-6에 동전의 개수를 추가한 프로그램이다. 
//커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다. 
//보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다. 
//지불할 돈이 충분히 있으면, 거스름돈을 지불 한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. 
//알맞은 코드를 넣 어서 프로그램을 완성하시오.

public class ex07 {

	public static void main(String[] args) {
		
		if(args.length!=1) {
			System.out.println("USAGE: java ex07");
			System.exit(0);
		}
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money= "+money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum=0;
			//코드 작성
			coinNum = money/coinUnit[i];   // 1. 동전 수 구하기
			
			if(coin[i]>=coinNum) {          //2. 만약 coin[i]와 동전수가 같거나 coin[i]가 많다면,
				coin[i] -= coinNum; 		//  2-1. coin[i]에서 동전수를 빼서 남은 coin[i]를 새롭게 대입 
				money %= coinUnit[i];       //  2-2. money는 새롭게 초기화 
				
			} else {                        // 3. 만약 coin[i]보다 동전 수가 크다면
				coinNum=coin[i];			//   3-1.  최대범위coin[i]를 coinNum에 대입 
				coin[i]=0;                  //   3-2.  coin[i]는 0개만남음
				money -= (coinNum * coinUnit[i]);   //money는 최대 동전수에서 coinUnit[i] 곱한 만큼 초기화함 
			}
			
			
			System.out.println(coinUnit[i]+"원: "+coinNum);
		}
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		
		System.out.println("=남은 동전의 개수 =");
			
		for(int i=0;i<coinUnit.length;i++) 
			System.out.println(coinUnit[i]+"원:"+coin[i]);
		
	}
}



		// coin[i]>coinNum 블록에서 money를 초기화했지만 
		// 결국coinNum*coinUnit[i]이 사용한 돈이므로
		// else의 money초기화와 같이 적용 가능하므로 
	   //money %= coinUnit[i] 삭제하고 
   		//money -= (coinNum * coinUnit[i]) if문 밖으로 빼 둘 다 적용하게 하면 코드가 더욱 깔끔해짐 



