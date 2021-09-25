package chapter09;


	class Card1 {
		String kind;
		int number;
		
		Card1() {
			this("SPADE", 1);
			
		}
		Card1(String kind, int num) {
			this.kind = kind;
			number = num;
		}
	   public String toString() {
		   return "kind : " +kind +"num :" + number;
	   }
	     }
	
		public class Ex9_06 {
			public static void main(String[] args) {
				Card1 c1 = new Card1();
				Card1 c2 = new Card1("DIAMONE",7);
				
				System.out.println(c1.toString());
				System.out.println(c2.toString());
				
			}
	}


