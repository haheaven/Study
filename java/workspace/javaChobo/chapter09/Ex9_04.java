package chapter09;


	class Card {
		String kind;
		int number;
		
		Card() {
			this("SPADE", 1);
			
		}
		Card(String kind, int num) {
			this.kind = kind;
			number = num;
		}
	   
	}	
		public class Ex9_04 {
			public static void main(String[] args) {
				Card c1 = new Card("SPace",3);
				Card c2 = new Card("dd",2);
				
				System.out.println(c1.toString());
				System.out.println(c2.toString());
				
			}
	}


